package com.mwgroup.block.controller;

import com.mwgroup.block.anno.LoginToken;
import com.mwgroup.block.common.request.PageQueryRequest;
import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.common.response.HttpResponse;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.export.ProductExportService;
import com.mwgroup.block.model.ProductDetailVo;
import com.mwgroup.block.model.request.ProductInfoRequest;
import com.mwgroup.block.model.request.ProductUpdateResultVo;
import com.mwgroup.block.model.request.QueryRecommendRequest;
import com.mwgroup.block.model.response.ProductListResponse;
import com.mwgroup.block.model.response.RecommendProductResponse;
import com.mwgroup.block.utils.HttpResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: 产品控制
 *
 * @author pcmd
 * @create 2019-11-18 23:36
 */
@Api(value = "算力")
@RestController
@RequestMapping(value = "/mwg/block/user")
public class ProductController {

    @Autowired
    private ProductExportService productExportService;

    /**
     * 添加算力
     * @param request ProductInfoRequest
     * @return HttpResponse
     */
    @LoginToken
    @RequestMapping(value = "addProduct", method = RequestMethod.POST)
    @ApiOperation(value = "添加算力")
    public HttpResponse addProduct(@RequestBody ProductInfoRequest request) {
        BaseResponse<ProductUpdateResultVo, BlockException> baseResponse = productExportService.addProduct(request);
        return HttpResponseUtil.converterToHttp(baseResponse);
    }


    /**
     * 查询算力列表
     *
     * @return
     */
    @ApiOperation(value = "查询算力列表")
    @RequestMapping(value = "queryList", method = RequestMethod.POST)
    public HttpResponse queryProductList(@RequestBody PageQueryRequest request) {

        BaseResponse<ProductListResponse, BlockException> baseResponse = productExportService.queryProductList(request);

        return HttpResponseUtil.converterToHttp(baseResponse);

    }

    /**
     * 获取算力详情
     * @param request ProductInfoRequest
     * @return HttpResponse
     */
    @ApiOperation(value = "获得算力详情")
    @RequestMapping(value = "getDetail", method = RequestMethod.POST)
    public HttpResponse getProductDetail(@RequestBody ProductInfoRequest request) {
        BaseResponse<ProductDetailVo, BlockException> baseResponse = productExportService.getProductDetail(request);
        return HttpResponseUtil.converterToHttp(baseResponse);
    }


    /**
     * 查询推荐算力
     *
     * @return
     */
    @ApiOperation(value = "获取推荐算力")
    @RequestMapping(value = "getRecommendProduct", method = RequestMethod.POST)
    public HttpResponse getRecommendProduct(@RequestBody QueryRecommendRequest request) {
        BaseResponse<RecommendProductResponse, BlockException> baseResponse = productExportService.getRecommendProduct(request);
        return HttpResponseUtil.converterToHttp(baseResponse);

    }

    /**
     * 添加库存
     *
     * @return
     */
    public HttpResponse addStock() {
        return null;
    }


}
