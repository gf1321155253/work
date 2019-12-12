package com.mwgroup.block.model.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述:
 * 查询推荐入餐
 *
 * @author pcmd
 * @create 2019-11-22 22:18
 */
@Data
@ApiModel
public class QueryRecommendRequest implements Serializable {
    private static final long serialVersionUID = 6311608294748943740L;
    /**用户ID*/
    private Long uid;

}
