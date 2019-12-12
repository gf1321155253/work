package com.mwgroup.block.controller;

import com.mwgroup.block.anno.LoginToken;
import com.mwgroup.block.common.request.BaseRequest;
import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.common.response.HttpResponse;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.export.ConnectExportService;
import com.mwgroup.block.model.request.ConnectRequest;
import com.mwgroup.block.model.response.ConnectResponse;
import com.mwgroup.block.utils.HttpResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: 沟通
 *
 * @author jinb.z
 * @create 2019-11-24 18:45
 */
@RestController
@RequestMapping(value = "/wmg/block/connect")
public class ConnectController {


    @Autowired
    private ConnectExportService connectExportService;


    /**
     * 代理商申请
     * @param request ConnectRequest
     * @return HttpResponse
     */
    @ApiOperation(value = "代理商申请")
    @RequestMapping(value = "agentApply",method = RequestMethod.POST)
    @LoginToken
    public HttpResponse agentApply(@RequestBody ConnectRequest request){
        BaseResponse<ConnectResponse, BlockException> baseResponse = connectExportService.agentApply(request);
        return HttpResponseUtil.converterToHttp(baseResponse);
    }


    /**
     * 代理商申请，状态查询
     * @param request ConnectRequest
     * @return HttpResponse
     */
    @ApiOperation(value = "查询状态")
    @RequestMapping(value = "status",method = RequestMethod.POST)
    @LoginToken
    public HttpResponse queryStatus(@RequestBody ConnectRequest request){
        BaseResponse<ConnectResponse, BlockException> baseResponse = connectExportService.queryStatus(request);
        return HttpResponseUtil.converterToHttp(baseResponse);
    }


    /**
     * 意见反馈
     * @param request
     * @return
     */
    @ApiOperation(value = "意见反馈")
    @RequestMapping(value = "feedback",method = RequestMethod.POST)
    @LoginToken
    public HttpResponse feedback(@RequestBody ConnectRequest request){

        BaseResponse<ConnectResponse, BlockException> baseResponse = connectExportService.feedback(request);
        return HttpResponseUtil.converterToHttp(baseResponse);

    }
}
