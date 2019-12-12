package com.mwgroup.block.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述:
 * 收益条目
 *
 * @author pcmd
 * @create 2019-11-23 16:17
 */
@Data
public class GainsItemVo implements Serializable {
    private static final long serialVersionUID = 6186436075133447857L;

    /**收益日期*/
    private Date gainsDate;
    /**收益金额*/
    private BigDecimal gains;

}
