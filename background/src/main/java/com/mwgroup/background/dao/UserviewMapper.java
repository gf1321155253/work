package com.mwgroup.background.dao;

import com.github.pagehelper.Page;
import com.mwgroup.background.entity.Userview;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserviewMapper {
    int insert(Userview record);

    int insertSelective(Userview record);

    //未审核用户数据
    Page<Userview> findallByStatus0();

    //已审核用户数据
    Page<Userview> findallByStatus12();

    //根据uid显示用户所有信息
    Page<Userview> select(@Param("uid")long uid);
}