package com.mwgroup.background.service;

import com.github.pagehelper.Page;
import com.mwgroup.background.dao.UserViewMapper;
import com.mwgroup.background.entity.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserViewService {

    @Autowired
    public UserViewMapper userViewMapper;

    public Page<UserView> findall(){
        return userViewMapper.findall();
    }

    public UserView selectById(Long id){
        return userViewMapper.selectById(id);
    }
}
