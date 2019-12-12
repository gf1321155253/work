package com.mwgroup.block.service;

import com.mwgroup.block.dao.ConnectDao;
import com.mwgroup.block.entity.ConnectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 *
 * @author jinb.z
 * @create 2019-11-25 00:36
 */
@Service
public class ConnectBaseService {


    @Autowired
    public ConnectDao connectDao;

    public int addConnect(ConnectEntity entity){
        return  connectDao.addConnect(entity);

    }


    public ConnectEntity queryStatusByUid(Long uid){
        return connectDao.queryStatusByUid(uid);
    }
}
