package com.mwgroup.block.export;

import com.mwgroup.block.common.BaseExportService;
import com.mwgroup.block.common.request.BaseRequest;
import com.mwgroup.block.common.request.PageQueryRequest;
import com.mwgroup.block.common.response.BaseResponse;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.facade.ProductFacadeService;
import com.mwgroup.block.model.ProductDetailVo;
import com.mwgroup.block.model.request.ProductInfoRequest;
import com.mwgroup.block.model.request.ProductUpdateResultVo;
import com.mwgroup.block.model.request.QueryRecommendRequest;
import com.mwgroup.block.model.response.ProductListResponse;
import com.mwgroup.block.model.response.RecommendProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * 算力 export service
 *
 * @author pcmd
 * @create 2019-11-22 13:21
 */
@Service
public class ProductExportService extends BaseExportService {


    @Autowired
    private ProductFacadeService productFacadeService;

    /**
     * 添加算力
     * @param request
     * @return
     */
    public BaseResponse<ProductUpdateResultVo, BlockException> addProduct(ProductInfoRequest request) {
        return process(productFacadeService, "addProduct", request);
    }


    /**
     * 查询算力列表
     * @param request
     * @return
     */
    public BaseResponse<ProductListResponse,BlockException>  queryProductList(PageQueryRequest request){
        return process(productFacadeService,"queryProductList",request);
    }


    /**
     * 获取算力详情
     * @param request
     * @return
     */
    public BaseResponse<ProductDetailVo , BlockException> getProductDetail(ProductInfoRequest request){
        return process(productFacadeService,"getProductDetail",request);
    }
    /**
     * 获取推荐算力列表
     * @param request
     * @return
     */
    public BaseResponse<RecommendProductResponse,BlockException> getRecommendProduct(QueryRecommendRequest request){
        return process(productFacadeService,"getRecommendProduct",request);
    }




}
