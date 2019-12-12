package com.mwgroup.block.model.response;

import com.mwgroup.block.model.ProductDetailVo;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 描述:
 *
 * @author pcmd
 * @create 2019-11-22 22:13
 */
@Data
@AllArgsConstructor
public class ProductListResponse implements Serializable {

    private static final long serialVersionUID = 7938873893892268916L;
    /**总数*/
    private Integer total;
    /**具体详情*/
    private List<ProductDetailVo> productInfoList;
}
