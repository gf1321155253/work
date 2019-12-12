package com.mwgroup.block.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:
 * 算力entity
 *
 * @author pcmd
 * @create 2019-11-22 12:55
 */
@Data
public class ProductEntity implements Serializable {
    private static final long serialVersionUID = 5488285369004403489L;
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

    private Integer sort;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;
    /**是否删除*/
    private Byte isDeleted;
}
