package com.mwgroup.block.common.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 描述:
 * 分页公共返回类
 *
 * @author pcmd
 * @create 2019-11-22 13:15
 */
@Data
public class PageInfoResponse<T> implements Serializable {
    private static final long serialVersionUID = 80481653841422359L;
    /**分页大小*/
    private Integer pageSize;
    /**页数*/
    private Integer pageNumber;
    /**总数*/
    private Integer total;
    /**数据实体*/
    private List<T> pageList;
}
