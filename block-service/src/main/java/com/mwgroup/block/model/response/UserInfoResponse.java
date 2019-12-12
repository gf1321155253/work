package com.mwgroup.block.model.response;

import lombok.Data;

import java.io.Serializable;

/**
 * 描述:
 * 用户信息返回类
 *
 * @author pcmd
 * @create 2019-11-21 23:49
 */

@Data
public class UserInfoResponse implements Serializable {
    private static final long serialVersionUID = 8538796953948811478L;
    /**用户Id*/
    private Long uid;
    /**用户姓名*/
    private String name;
    /**用户头像*/
    private String photo;
}
