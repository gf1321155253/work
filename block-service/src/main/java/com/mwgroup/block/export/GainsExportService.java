package com.mwgroup.block.export;

import com.mwgroup.block.common.BaseExportService;
import com.mwgroup.block.common.request.BaseRequest;
import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.facade.GainFacadeService;
import com.mwgroup.block.model.response.GainsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * 收益
 *
 * @author pcmd
 * @create 2019-11-23 22:53
 */
@Service
public class GainsExportService  extends BaseExportService {

    @Autowired
    private GainFacadeService gainFacadeService;



    public BaseResponse<GainsResponse, BlockException> getGains(BaseRequest  request){
        return process(gainFacadeService,"getGain",request);
    }



}
