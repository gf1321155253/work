package com.mwgroup.background.dao;

import com.mwgroup.background.entity.UserIdentify;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserIdentifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserIdentify record);

    int insertSelective(UserIdentify record);

    UserIdentify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserIdentify record);

    int updateByPrimaryKey(UserIdentify record);

    int update(@Param("uid")long uid,@Param("status")byte status);
}