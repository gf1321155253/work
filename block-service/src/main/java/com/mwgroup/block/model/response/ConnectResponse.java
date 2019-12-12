package com.mwgroup.block.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * 描述:
 *
 * @author jinb.z
 * @create 2019-11-25 00:31
 */
@Data
@AllArgsConstructor
public class ConnectResponse implements Serializable {
    private static final long serialVersionUID = -5144953800897938269L;
    /**返回结果*/
    private Boolean result;
    /**申请状态*/
    private Integer status;


    public ConnectResponse(Boolean result) {
        this.result = result;
    }
}
