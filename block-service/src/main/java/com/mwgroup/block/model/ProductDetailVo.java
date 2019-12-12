package com.mwgroup.block.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 描述:
 *
 * @author pmcd
 * @create 2019-11-22 13:25
 */
@Data
public class ProductDetailVo implements Serializable {
    private static final long serialVersionUID = 1098569521164349261L;
    /**算力ID*/
    private Integer pid ;
    /**名称*/
    private String title;
    /**利率*/
    private BigDecimal rate;
    /**库存*/
    private Integer stock;
    /**期数*/
    private Integer period;

}
