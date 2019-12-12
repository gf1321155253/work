package com.mwgroup.block.common.request;

import lombok.Data;

import javax.annotation.security.DenyAll;

/**
 * 描述:
 * baseRequest
 *
 * @author pcmd
 * @create 2019-11-18 23:43
 */
@Data
public class BaseRequest {
    /**用户Id*/
    private Long uid;
    /**手机client ID 用来做一些防护*/
    private String clientId;
}
