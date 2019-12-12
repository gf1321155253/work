package com.mwgroup.block.dao;

import com.mwgroup.block.entity.UserEntity;
import com.mwgroup.block.model.UserDto;
import com.mwgroup.block.model.request.LoginRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 描述:
 * 用户dao
 *
 * @author pcmd
 * @create 2019-11-21 00:39
 */
@Mapper
public interface UserDao {

    /**
     * 根据用户Id 查询用户信息
     *
     * @param uid 用户ID
     * @return
     */
    UserEntity getUserByUid(@Param("uid") Long uid);

    UserEntity getUserAuthByUid(@Param("uid")Long uid);

    /**
     * 根据电话好查询用户信息
     *
     * @param loginRequest 登陆信息
     * @return
     */
    UserEntity getUserForLogin(@Param("login") UserDto userDto);


    /**
     * 添加用户信息
     *
     * @param entity 用户实体
     * @return
     */
    int insertUser(@Param("entity") UserEntity entity);


    /**
     * 修改用户密码
     * @param uid
     * @param password
     * @return
     */
    int updatePassword(@Param("uid") Long uid, @Param("password") String password);

}
