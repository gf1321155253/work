package com.mwgroup.block.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 描述:
 *
 * @author pcmd
 * @create 2019-11-22 00:35
 */
@Data
public class UserDto  implements Serializable {
    private static final long serialVersionUID = -533269881979925706L;


    /**用户登陆信息*/
    private String account;
    /**用户密码*/
    private String password;
    /**登陆方式 1 手机 2 邮箱*/
    private Integer loginType;
}
