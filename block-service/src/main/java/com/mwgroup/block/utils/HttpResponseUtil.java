package com.mwgroup.block.utils;

import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.common.response.HttpResponse;

/**
 * 描述:
 * http response 转换类
 *
 * @author pcmd
 * @create 2019-11-21 00:25
 */
public class HttpResponseUtil {




    public static HttpResponse converterToHttp(BaseResponse baseResponse) {

        HttpResponse response = new HttpResponse();

        response.setData(baseResponse.getResponseVo());
        response.setErrorCode(baseResponse.getReturnCode());
        response.setErrMsg(baseResponse.getReturnMsg());
        return response;
    }
}
