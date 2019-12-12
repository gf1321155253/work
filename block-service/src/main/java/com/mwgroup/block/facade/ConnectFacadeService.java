package com.mwgroup.block.facade;

import com.mwgroup.block.constant.BlockServiceConstant;
import com.mwgroup.block.entity.ConnectEntity;
import com.mwgroup.block.model.request.ConnectRequest;
import com.mwgroup.block.model.response.ConnectResponse;
import com.mwgroup.block.service.ConnectBaseService;
import com.mwgroup.block.utils.VerifyParamUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 *
 * @author jinb.z
 * @create 2019-11-25 00:18
 */
@Service
public class ConnectFacadeService {


    @Autowired
    private ConnectBaseService connectBaseService;

    public ConnectResponse agentApply(ConnectRequest request){

        VerifyParamUtils.newCheck()
                .check(request)
                .check(request.getUid(),request.getMobile(),request.getDesc());

        ConnectEntity entity = new ConnectEntity();

        BeanUtils.copyProperties(request,entity);
        entity.setType(BlockServiceConstant.CONNECT_TYPE_AGENT);
        connectBaseService.addConnect(entity);


        return new ConnectResponse(Boolean.TRUE);
    }



    public ConnectResponse queryStatus(ConnectRequest request){


        VerifyParamUtils.newCheck()
                .check(request)
                .check(request.getUid());

        ConnectEntity entity = connectBaseService.queryStatusByUid(request.getUid());

        return new ConnectResponse(Boolean.TRUE,entity.getStates());
    }



    public ConnectResponse feedback(ConnectRequest request){

        VerifyParamUtils.newCheck()
                .check(request)
                .check(request.getUid(),request.getMobile(),request.getDesc());

        ConnectEntity entity = new ConnectEntity();

        BeanUtils.copyProperties(request,entity);
        entity.setType(BlockServiceConstant.CONNECT_TYPE_FADE);
        connectBaseService.addConnect(entity);

        return new ConnectResponse(Boolean.TRUE);
    }
}
