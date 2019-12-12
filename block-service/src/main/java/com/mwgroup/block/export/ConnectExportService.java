package com.mwgroup.block.export;

import com.mwgroup.block.common.BaseExportService;
import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.facade.ConnectFacadeService;
import com.mwgroup.block.model.request.ConnectRequest;
import com.mwgroup.block.model.response.ConnectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 *
 * @author jinb.z
 * @create 2019-11-25 00:16
 */
@Service
public class ConnectExportService extends BaseExportService {


    @Autowired
    private ConnectFacadeService connectFacadeService;

    /**
     * 代理商申请
     * @param request
     * @return
     */
    public BaseResponse<ConnectResponse, BlockException> agentApply(ConnectRequest request){
        return process(connectFacadeService,"agentApply",request);
    }


    /**
     * 查询代理商状态
     * @param request
     * @return
     */
    public BaseResponse<ConnectResponse, BlockException> queryStatus(ConnectRequest request){
        return process(connectFacadeService,"queryStatus",request);
    }


    /**
     * 意见反馈
     * @param request
     * @return
     */
    public BaseResponse <ConnectResponse, BlockException> feedback(ConnectRequest request){
        return process(connectFacadeService,"feedback",request);
    }



}
