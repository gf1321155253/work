package com.mwgroup.block.model.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 描述:
 * 用户注册 request
 *
 * @author pcmd
 * @create 2019-11-21 20:54
 */
@Data
@ApiModel
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 7311042240990499720L;
    /**密码*/
    @NotNull
    private String password;
    /**手机号*/
    private String mobile;
    /**邮箱*/
    private String email;
    /**验证码*/
    private String code;
    /**登陆方式*/
    @Max(2)
    private Integer loginType;
}
