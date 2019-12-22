package com.mwgroup.background.dao;

import com.github.pagehelper.Page;
import com.mwgroup.background.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    //显示所有数据
    Page<Order> findall();

    //根据pid查询订单数据
    Page<Order> selectByPid(@Param("pid")Long pid);

    //根据uid查询订单数据
    Page<Order> selectByUid(@Param("uid")Long uid);

    //根据uid 和 pid进行查询
    Page<Order> select(@Param("uid")Long uid,@Param("pid")Long pid);
}