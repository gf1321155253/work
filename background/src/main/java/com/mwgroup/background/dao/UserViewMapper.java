package com.mwgroup.background.dao;

import com.github.pagehelper.Page;
import com.mwgroup.background.entity.UserView;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserViewMapper {
    int insert(UserView record);

    int insertSelective(UserView record);

    //显示所有用户数据
    Page<UserView> findall();

    //根据id查询用户具体数据
    UserView selectById(Long id);
}