package com.mwgroup.block.export;

import com.mwgroup.block.common.BaseExportService;
import com.mwgroup.block.common.request.BaseRequest;
import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.facade.UserFacadeService;
import com.mwgroup.block.model.request.LoginRequest;
import com.mwgroup.block.model.request.SendVerifyCodeRequest;
import com.mwgroup.block.model.request.UserInfoRequest;
import com.mwgroup.block.model.request.UserRegisterRequest;
import com.mwgroup.block.model.response.LoginResponse;
import com.mwgroup.block.model.response.UserInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * 用户export
 *
 * @author pcmd
 * @create 2019-11-21 00:20
 */
@Service
public class UserExportService extends BaseExportService {

    @Autowired
    private UserFacadeService userFacadeService;

    /**
     * 用户登陆
     *
     * @param request 入参数
     * @return
     */
    public BaseResponse<LoginResponse, BlockException> login(LoginRequest request) {
        return process(userFacadeService, "login", request);
    }


    /**
     * 用户注册
     *
     * @param request 入参数
     * @return
     */
    public BaseResponse<LoginResponse, BlockException> register(UserRegisterRequest request) {
        return process(userFacadeService, "register", request);
    }


    /**
     * 找回密码
     *
     * @param request 用户信息
     * @return
     */
    public BaseResponse<LoginResponse, BlockException> retrievedPassword(UserRegisterRequest request) {
        return process(userFacadeService, "retrievedPassword", request);
    }


    /**
     * 获取用户信息
     *
     * @param request 用户信息
     * @return
     */
    public BaseResponse<UserInfoResponse, BlockException> getUserInfoByUid(UserInfoRequest request) {
        return process(userFacadeService, "getUserInfoByUid", request);
    }


    /**
     * 发送验证码，手机或者邮件
     * @param request
     * @return
     */
    public BaseResponse<Void,BlockException> sendCode(SendVerifyCodeRequest request){
        return process(userFacadeService,"sendCode",request);
    }
}
