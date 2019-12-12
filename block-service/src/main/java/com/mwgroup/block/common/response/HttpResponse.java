package com.mwgroup.block.common.response;

import lombok.Data;

import java.io.Serializable;

/**
 * 描述:
 * Http 公共响应
 *
 * @author pcmd
 * @create 2019-11-18 23:44
 */
@Data
public class HttpResponse<T> implements Serializable {

    /**错误码*/
    private String errorCode;
    /**错误异常描述*/
    private String errMsg;
    /**业务数据*/
    private T data;

}
