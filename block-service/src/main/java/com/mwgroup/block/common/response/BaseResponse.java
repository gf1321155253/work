package com.mwgroup.block.common.response;

import lombok.Data;

/**
 * 描述:
 * 基础返回值
 *
 * @author pcmd
 * @create 2019-11-20 23:45
 */
@Data
public class BaseResponse<T,ErrT> {
    /**返回值*/
    private T responseVo;
    /**返回异常信息*/
    private ErrT errt;
    /**返回错误吗*/
    private String returnCode;
    /**返回错误信息*/
    private String returnMsg;
}
