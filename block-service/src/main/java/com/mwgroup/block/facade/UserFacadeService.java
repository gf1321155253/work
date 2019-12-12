package com.mwgroup.block.facade;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.mwgroup.block.cache.CacheClient;
import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.constant.BlockServiceConstant;
import com.mwgroup.block.entity.UserEntity;
import com.mwgroup.block.exception.BlockErrorCode;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.model.UserDto;
import com.mwgroup.block.model.request.LoginRequest;
import com.mwgroup.block.model.request.SendVerifyCodeRequest;
import com.mwgroup.block.model.request.UserInfoRequest;
import com.mwgroup.block.model.request.UserRegisterRequest;
import com.mwgroup.block.model.response.LoginResponse;
import com.mwgroup.block.model.response.UserInfoResponse;
import com.mwgroup.block.service.UserBaseService;
import com.mwgroup.block.service.msgsend.AbstractSendMsgService;
import com.mwgroup.block.service.msgsend.SendMessageFactory;
import com.mwgroup.block.utils.JwtUtils;
import com.mwgroup.block.utils.SnowflakeIdWorker;
import com.mwgroup.block.utils.VerifyParamUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


/**
 * 描述:
 * 用户登陆实现类
 *
 * @author pcmd
 * @create 2019-11-21 00:22
 */
@Service
public class UserFacadeService {


    @Autowired
    private UserBaseService userBaseService;

    @Autowired
    private CacheClient  cacheClient;

    @Autowired
    private SendMessageFactory messageFactory;


    private static  final Cache<String, Boolean> CACHE = Caffeine.newBuilder()
            .expireAfterAccess(60, TimeUnit.SECONDS)
            .build();

    /**
     * 用户登陆
     *
     * @param request
     * @return
     */
    public LoginResponse login(LoginRequest request) {

        VerifyParamUtils.newCheck()
                .check(request)
                .check(request.getPassword(),request.getLoginType(),request.getPassword());

        UserDto userDto = new UserDto();
        userDto.setLoginType(request.getLoginType());
        userDto.setAccount(request.getAccount());
        userDto.setPassword(request.getPassword());

        UserEntity user = userBaseService.getUserForLogin(userDto);

        if (null == user) {
            throw new BlockException(BlockErrorCode.USER_PASSWORD_ERROR);
        }

        if (!user.getPassword().equals(request.getPassword())) {
            throw new BlockException(BlockErrorCode.USER_PASSWORD_ERROR);
        }

        String token = JwtUtils.getToken(user.getUid(), user.getPassword());

        return new LoginResponse(token, user.getUid());
    }


    /**
     * 用户注册
     *
     * @param request
     * @return
     */
    public LoginResponse register(UserRegisterRequest request) {
        VerifyParamUtils.newCheck()
                .check(request)
                .check(request.getPassword(), request.getCode(),request.getCode());

        String account = null;
        if(BlockServiceConstant.LOGIN_TYPE_MOBILE.equals(request.getLoginType())){
            VerifyParamUtils.newCheck().check(request.getMobile());
            account = request.getMobile();
        }else {
            VerifyParamUtils.newCheck().check(request.getEmail());
            account = request.getEmail();
        }


        String value =(String) cacheClient.get("code:"+account);

        if(!request.getCode().equals(value)){
            throw new BlockException(BlockErrorCode.IDENTIFY_CODE_EXPIRE) ;
        }

        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(request, entity);
        Long uid = SnowflakeIdWorker.getId();
        entity.setUid(uid);

        userBaseService.insertUser(entity);

        String token = JwtUtils.getToken(uid, entity.getPassword());

        return new LoginResponse(token, uid);
    }


    /**
     * 找回密码
     *
     * @return
     */
    public LoginResponse retrievedPassword(UserRegisterRequest request) {

        VerifyParamUtils.newCheck()
                .check(request)
                .check(request.getCode(), request.getPassword());

        UserDto userDto = new UserDto();
        userDto.setAccount(request.getMobile());
        userDto.setLoginType(BlockServiceConstant.LOGIN_TYPE_MOBILE);


        if (!request.getCode().equals("")) {
            throw new BlockException(BlockErrorCode.IDENTIFY_CODE_EXPIRE);
        }

        UserEntity user = userBaseService.getUserForLogin(userDto);
        if (user == null) {
            throw new BlockException(BlockErrorCode.USER_PASSWORD_ERROR);
        }

        boolean result = userBaseService.updatePassword(user.getUid(), request.getPassword());

        if (!result) {
            throw new BlockException(BlockErrorCode.MODIFY_PASSWORD_ERROR);
        }

        String token = JwtUtils.getToken(user.getUid(), request.getPassword());
        return new LoginResponse(token, user.getUid());
    }


    /**
     * 获取用户信息
     *
     * @param request
     * @return
     */
    public UserInfoResponse getUserInfoByUid(UserInfoRequest request) {

        VerifyParamUtils.newCheck().check(request)
                .check(request.getUid());

        UserEntity user = userBaseService.getUserByUid(request.getUid());

        if(null == user){
            throw new BlockException(BlockErrorCode.USER_NOT_EXIST);
        }
        UserInfoResponse response = new UserInfoResponse();
        response.setUid(user.getUid());
        response.setName(user.getName());
        response.setPhoto(user.getPhoto());

        return response;

    }


    /**
     * 发送验证码
     * @param request
     * @return
     */
    public BaseResponse sendCode(SendVerifyCodeRequest request){

        VerifyParamUtils.newCheck()
                .check(request).check(request.getLoginType(),request.getAccount(),request.getClientId());


//         Caffeine 本地缓存做 频率限制限制，1分钟只允许发一次
        Boolean ifPresent = CACHE.getIfPresent(request.getAccount());
        if(null != ifPresent && ifPresent){
            throw new BlockException(BlockErrorCode.CODE_SEND_TO_FAST);
        }
        CACHE.put(request.getAccount(), Boolean.TRUE);

        AbstractSendMsgService sendMsgService = messageFactory.get(request.getLoginType());


        sendMsgService.sendCode(request);

        return new BaseResponse();



    }


}
