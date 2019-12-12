package com.mwgroup.block.common.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 描述:
 * 分页查询 公共入参数
 *
 * @author pcmd
 * @create 2019-11-22 13:19
 */
@Data
public class PageQueryRequest<T> implements Serializable {
    private static final long serialVersionUID = 7873487235362940863L;
    /**分页大小*/
    private Integer pageSize;
    /**页数*/
    private Integer pageNumber;
    /**查询条件*/
    private T queryParam;
}
