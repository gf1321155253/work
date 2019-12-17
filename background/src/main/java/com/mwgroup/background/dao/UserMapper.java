package com.mwgroup.background.dao;

import com.mwgroup.background.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User selectByMobile(@Param("user")User user);
}