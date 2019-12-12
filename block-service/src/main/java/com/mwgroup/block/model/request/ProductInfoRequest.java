package com.mwgroup.block.model.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 描述:
 * 算力信息返回类
 *
 * @author pcmd
 * @create 2019-11-22 12:58
 */
@Data
@ApiModel
public class ProductInfoRequest  implements Serializable {
    private static final long serialVersionUID = -233491687149531287L;

    /**算力ID*/
    private Long pid ;
    /**名称*/
    private String title;
    /**利率*/
    private BigDecimal rate;
    /**库存*/
    private Integer stock;
    /**期数*/
    private Integer period;
    /**排序*/
    private Integer sort;
}
