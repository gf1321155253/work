package com.mwgroup.background.dao;

import com.github.pagehelper.Page;
import com.mwgroup.background.entity.Connect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConnectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Connect record);

    int insertSelective(Connect record);

    Connect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Connect record);

    int updateByPrimaryKeyWithBLOBs(Connect record);

    int updateByPrimaryKey(Connect record);

    //显示所有用户反馈的信息
    Page<Connect> findallByType1();

    //显示所有代理商申请的信息
    Page<Connect> findallByType0();

}