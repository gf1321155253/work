package com.example.demo.dao;

import com.example.demo.entity.Brand;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);

    //查询所有
    List<Brand> findall();

    //模糊查询
    List<Brand> mhselect(String goodsname);

    //分页查询语句
    @Select("SELECT * FROM brand")
    Page<Brand> getUserList();
}