package com.mwgroup.background.dao;

import com.mwgroup.background.entity.Banner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BannerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Banner record);

    //新增图片
    int insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);

    //查询所有图片
    List<Banner> findall();

    // 查询场景为1的图片
    List<Banner> findallByScence1();

    // 查询场景为2的图片
    List<Banner> findallByScence2();

    // 查询场景为3的图片
    List<Banner> findallByScence3();

    // 查询场景为4的图片
    List<Banner> findallByScence4();

}