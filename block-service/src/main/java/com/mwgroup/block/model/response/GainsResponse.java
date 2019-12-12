package com.mwgroup.block.model.response;

import com.mwgroup.block.model.GainsDetailVo;
import com.mwgroup.block.model.GainsItemVo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 描述:
 * 收益返回类
 *
 * @author pcmd
 * @create 2019-11-23 16:14
 */
@Data
public class GainsResponse implements Serializable {
    private static final long serialVersionUID = 7512102146130640077L;
    /**收益详情*/
    private GainsDetailVo detail;
    /**往期收益列表*/
    private List<GainsItemVo> gainsList;
}
