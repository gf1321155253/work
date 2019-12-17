package com.mwgroup.background.dao;

import com.github.pagehelper.Page;
import com.mwgroup.background.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    int deleteByPrimaryKey(Long pid);

    int insert(Product record);

    //新增算力产品
    int insertSelective(Product record);

    Product selectByPrimaryKey(Long pid);

    //修改算力产品
    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    //显示所有算力产品
    Page<Product> findall();

    //虚拟删除
    int del(@Param("id")Long id);

    //算力产品查询 搜索
    Page<Product> select(@Param("title")String title,@Param("id")Long id);
}