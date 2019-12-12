package com.mwgroup.block.controller;

import com.mwgroup.block.anno.PassToken;
import com.mwgroup.block.anno.LoginToken;
import com.mwgroup.block.common.request.BaseRequest;
import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.common.response.HttpResponse;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.export.UserExportService;
import com.mwgroup.block.model.request.LoginRequest;
import com.mwgroup.block.model.request.SendVerifyCodeRequest;
import com.mwgroup.block.model.request.UserInfoRequest;
import com.mwgroup.block.model.request.UserRegisterRequest;
import com.mwgroup.block.model.response.LoginResponse;
import com.mwgroup.block.model.response.UserInfoResponse;
import com.mwgroup.block.utils.HttpResponseUtil;
import com.sun.org.apache.regexp.internal.RE;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 描述: 用户控制
 *
 * @author pcmd
 * @create 2019-11-18 22:32
 */
@Api(value = "/mwg/block/user")
@RestController
@RequestMapping(value = "mwg/block/user")
public class UserController {


    @Autowired
    private UserExportService userExportService;

    /**
     * 用户登陆
     *
     * @param request
     * @return
     */
    @PassToken
    @ApiOperation(value = "用户登陆")
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public HttpResponse login(@RequestBody LoginRequest request) {

        BaseResponse<LoginResponse, BlockException> baseResponse = userExportService.login(request);
        return HttpResponseUtil.converterToHttp(baseResponse);
    }


    /**
     * 用户注册
     * @param request
     * @return
     */
    @PassToken
    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public HttpResponse register(@RequestBody UserRegisterRequest request) {

        BaseResponse<LoginResponse, BlockException> baseResponse = userExportService.register(request);
        return HttpResponseUtil.converterToHttp(baseResponse);
    }


    /**
     * 密码找回
     * @param request
     * @return
     */
    @PassToken
    @ApiOperation(value = "密码找回")
    @RequestMapping(value = "retrieved", method = RequestMethod.POST)
    public HttpResponse retrievedPassword(@RequestBody UserRegisterRequest request) {
        BaseResponse<LoginResponse, BlockException> baseResponse = userExportService.retrievedPassword(request);
        return HttpResponseUtil.converterToHttp(baseResponse);
    }


    /**
     * 获取用户信息
     * @param request
     * @return
     */
    @LoginToken
    @ApiOperation(value = "获取用户信息")
    @RequestMapping(value = "userInfo", method = RequestMethod.POST)
    public HttpResponse getUserInfoByUid(@RequestBody UserInfoRequest request) {
        BaseResponse<UserInfoResponse, BlockException> baseResponse = userExportService.getUserInfoByUid(request);
        return HttpResponseUtil.converterToHttp(baseResponse);
    }


    /**
     * 发送验证码
     * @param request
     * @return
     */
    @ApiOperation(value = "发送验证码")
    @RequestMapping(value = "sendCode",method = RequestMethod.POST)
    public HttpResponse sendCode(@RequestBody SendVerifyCodeRequest request){
        BaseResponse<Void, BlockException> baseResponse = userExportService.sendCode(request);
        return HttpResponseUtil.converterToHttp(baseResponse);

    }

}
