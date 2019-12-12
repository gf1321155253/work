package com.mwgroup.block.common;

import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.exception.BlockErrorCode;
import com.mwgroup.block.exception.BlockException;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;


/**
 * 描述:
 *
 * @author pcmd
 * @create 2019-11-18 23:39
 */
@Slf4j
public class BaseExportService {

    public <T,ErrT> BaseResponse<T, ErrT> process(Object service,String method,Object input){

        BaseResponse<T,ErrT> baseResponse = new BaseResponse<>();

        try {

            T t = null;

            try {
                t = (T) service.getClass().getMethod(method, input.getClass()).invoke(service, input);
                baseResponse.setResponseVo(t);
                baseResponse.setReturnCode(BlockErrorCode.SUCCESS.getErrorCode());
                baseResponse.setReturnMsg(BlockErrorCode.SUCCESS.getErrorMSg());
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }

        }catch (BlockException baseException){
            baseResponse.setReturnCode(baseException.getBlockErrorCode().getErrorCode());
            baseResponse.setReturnMsg(baseException.getBlockErrorCode().getErrorMSg());
            log.error(method+" throw biz exception!"  ,baseException);
        }catch (Throwable t){
            baseResponse.setReturnCode(BlockErrorCode.ERROR.getErrorCode());
            baseResponse.setReturnMsg(BlockErrorCode.ERROR.getErrorMSg());
            log.error(method+" throw system exception"  ,t);
        }

        return baseResponse;
    }
}
