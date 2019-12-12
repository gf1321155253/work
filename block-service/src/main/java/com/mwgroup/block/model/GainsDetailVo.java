package com.mwgroup.block.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 描述:
 * 收益总览
 *
 * @author pcmd
 * @create 2019-11-23 16:15
 */
@Data
public class GainsDetailVo implements Serializable {

    private static final long serialVersionUID = 7711726395689598144L;
    /**昨日收益*/
    private BigDecimal lesterGains;
    /**今日收益*/
    private BigDecimal todayGains;
    /**余额*/
    private BigDecimal balance;
    /**已支付*/
    private BigDecimal alreadyPay;
    /**单位*/
    private String unit;
}
