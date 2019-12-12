package com.mwgroup.block.service;

import com.mwgroup.block.dao.UserDao;
import com.mwgroup.block.entity.UserEntity;
import com.mwgroup.block.model.UserDto;
import com.mwgroup.block.model.request.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * 用户基础Service
 *
 * @author pcmd
 * @create 2019-11-21 00:38
 */
@Service
public class UserBaseService {

    @Autowired
    private UserDao userDao;


    public UserEntity getUserForLogin(UserDto request) {
        return userDao.getUserForLogin(request);
    }

    public UserEntity getUserByUid(Long uid) {

        return userDao.getUserByUid(uid);
    }

    @Cacheable(value = "auth",cacheManager = "caffeine")
    public UserEntity getUserAuthByUid(Long uid){
        return userDao.getUserAuthByUid(uid);
    }

    public int insertUser(UserEntity entity) {

        return userDao.insertUser(entity);
    }


    public boolean updatePassword(Long uid, String password) {
        return 1 == userDao.updatePassword(uid, password);
    }
}
