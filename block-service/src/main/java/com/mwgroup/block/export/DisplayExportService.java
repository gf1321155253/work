package com.mwgroup.block.export;

import com.mwgroup.block.common.BaseExportService;
import com.mwgroup.block.common.request.BaseRequest;
import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.facade.DisplayFacadeService;
import com.mwgroup.block.model.response.DisPlayListResponse;
import org.redisson.command.BaseRedisBatchExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * 展示exportService
 *
 * @author pcmd
 * @create 2019-11-24 18:07
 */
@Service
public class DisplayExportService extends BaseExportService {


    @Autowired
    private DisplayFacadeService displayFacadeService;


    /**
     *
     * @param request
     * @return
     */
    public BaseResponse<DisPlayListResponse, BlockException> queryDisplayList(BaseRequest request){
        return process(displayFacadeService,"queryDisplayList",request);
    }



}
