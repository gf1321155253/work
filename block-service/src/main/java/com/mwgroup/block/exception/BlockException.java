package com.mwgroup.block.exception;

import lombok.Data;
import lombok.ToString;

/**
 * 描述:
 * 业务异常
 *
 * @author pcmd
 * @create 2019-11-18 23:38
 */
@Data
public class BlockException extends RuntimeException {

    private BlockErrorCode blockErrorCode;

    public BlockException(BlockErrorCode blockErrorCode) {
        this.blockErrorCode = blockErrorCode;
    }


    @Override
    public String toString() {
        return "BlockException{" +
                "blockErrorMsg=" + blockErrorCode.getErrorMSg() +
                "blockErrorMsg=" + blockErrorCode.getErrorCode() +
                '}';
    }
}
