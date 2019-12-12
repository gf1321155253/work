package com.mwgroup.block.controller;

import com.mwgroup.block.anno.LoginToken;
import com.mwgroup.block.common.request.BaseRequest;
import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.common.response.HttpResponse;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.export.GainsExportService;
import com.mwgroup.block.model.response.GainsResponse;
import com.mwgroup.block.utils.HttpResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 描述: 收益controller
 *
 * @author pcmd
 * @create 2019-11-23 16:05
 */
@Api(value = "收益")
@RestController
@RequestMapping(value = "/mwg/block/gains")
public class GainsController {


    @Autowired
    private GainsExportService gainsExportService;

    /**
     * 获取收益
     * @param request
     * @return
     */
    @LoginToken
    @ApiOperation(value = "获取收益")
    @RequestMapping(value = "getGains",method = RequestMethod.POST)
    public HttpResponse queryGains(@RequestBody BaseRequest request){
        BaseResponse<GainsResponse, BlockException> baseResponse = gainsExportService.getGains(request);
        return HttpResponseUtil.converterToHttp(baseResponse);
    }
}
