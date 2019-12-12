package com.mwgroup.block.model.request;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * 描述:
 * 跟新通过结果返回类
 *
 * @author pcmd
 * @create 2019-11-22 22:38
 */
@Data
@ApiModel
public class ProductUpdateResultVo implements Serializable {
    private static final long serialVersionUID = -5207093630994940341L;

    /**返回结果*/
    private Boolean result;
    /**产品Id*/
    private Long pid;


    public ProductUpdateResultVo(Boolean result) {
        this.result = result;
    }
}
