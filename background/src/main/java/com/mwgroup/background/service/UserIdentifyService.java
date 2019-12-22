package com.mwgroup.background.service;

import com.mwgroup.background.dao.UserIdentifyMapper;
import com.mwgroup.background.dao.UserviewMapper;
import com.mwgroup.background.entity.UserIdentify;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserIdentifyService {

    @Autowired
    private UserIdentifyMapper userIdentifyMapper;

    //修改审核状态
    public int update(long uid,byte status){
        return userIdentifyMapper.update(uid,status);
    }
}
