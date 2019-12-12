package com.example.demo.dao;

import com.example.demo.entity.Users;
import org.apache.ibatis.annotations.Mapper;

/*
* 描述： 用户mapper类
* */

@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}