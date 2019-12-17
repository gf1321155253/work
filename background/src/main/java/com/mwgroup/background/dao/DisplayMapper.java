package com.mwgroup.background.dao;

import com.github.pagehelper.Page;
import com.mwgroup.background.entity.Display;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DisplayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Display record);

    //新增公告
    int insertSelective(Display record);

    //查询公告 编辑公告
    Display selectByPrimaryKey(Integer id);

    //编辑公告提交
    int updateByPrimaryKeySelective(Display record);

    int updateByPrimaryKey(Display record);

    //查询所有数据
    Page<Display> findall();

    //虚拟删除
    int delById(@Param("id") int id);

}