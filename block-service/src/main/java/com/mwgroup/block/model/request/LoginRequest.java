package com.mwgroup.block.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 描述:
 * 用户request
 * @author pcmd
 * @create 2019-11-20 00:34
 */
@Data
@ApiModel
public class LoginRequest implements Serializable {

    private static final long serialVersionUID = -4941846032292350762L;
    /**用户登陆账号*/
    @ApiModelProperty(value ="用户登陆账号" )
    private String account;
    /**用户密码*/
    @NotNull(message = "密码不能为空")
    private String password;
    /**登陆方式 1 手机 2 邮箱*/
    @Max(2)
    @ApiModelProperty(value = "登陆类型 1 手机 2 邮箱")
    private Integer loginType;



}
