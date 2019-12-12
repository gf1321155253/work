package com.mwgroup.block.dao;

import com.mwgroup.block.entity.ConnectEntity;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

/**
 * 描述:
 *
 * @author jinb.z
 * @create 2019-11-25 00:44
 */
@Mapper
public interface ConnectDao {

    /**
     * 添加 代理商申请或者意见反馈
     * @param entity
     * @return
     */
    int addConnect(@Param("entity")ConnectEntity entity);



    ConnectEntity queryStatusByUid(@Param("uid") Long uid);
}
