package com.mwgroup.block.model.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 描述:
 * 推荐算力vo
 *
 * @author ocmd
 * @create 2019-11-22 22:25
 */
@Data
public class RecommendProductResponse implements Serializable {
    private static final long serialVersionUID = 6695849417555363602L;

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
    /**显示信息*/
    private String message;

}
