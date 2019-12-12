package com.mwgroup.block.controller;

import com.mwgroup.block.anno.PassToken;
import com.mwgroup.block.common.request.BaseRequest;
import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.common.response.HttpResponse;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.export.DisplayExportService;
import com.mwgroup.block.model.request.BannerRequest;
import com.mwgroup.block.model.response.DisPlayListResponse;
import com.mwgroup.block.utils.HttpResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;

/**
 * 描述: 展示控制器
 *
 * @author pcmd
 * @create 2019-11-18 23:35
 */
@Api(value = "展示")
@RestController
@RequestMapping(value = "/mwg/block/display")
public class DisplayController {



    @Autowired
    private DisplayExportService displayExportService;


    /**
     * 获取公告信息
     * @param request
     * @return
     */

    @ApiOperation(value = "获取公告信息")
    @RequestMapping(value = "queryList",method = RequestMethod.POST)
    public HttpResponse queryDisplayList(@RequestBody BaseRequest request){
        BaseResponse<DisPlayListResponse, BlockException> baseResponse = displayExportService.queryDisplayList(request);

        return HttpResponseUtil.converterToHttp(baseResponse);
    }


    /**
     * 获取轮播图
     * @param request BannerRequest
     * @return
     */
    @PassToken
    @RequestMapping(value = "banner",method = RequestMethod.POST)
    public HttpResponse getBanner(@RequestBody BannerRequest request){

        return HttpResponseUtil.converterToHttp(null);
    }




}
