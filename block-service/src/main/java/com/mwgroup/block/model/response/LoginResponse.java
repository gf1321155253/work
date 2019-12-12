package com.mwgroup.block.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 描述:
 * 登陆返回信息
 *
 * @author pcmd
 * @create 2019-11-20 00:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse implements Serializable {
    private static final long serialVersionUID = -3508565596683146762L;
    /**登陆成功身份信息*/
    private String token;
    /**用户uId*/
    private Long uid;


}
