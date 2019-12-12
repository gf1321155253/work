package com.mwgroup.block.facade;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mwgroup.block.common.request.PageQueryRequest;
import com.mwgroup.block.entity.ProductEntity;
import com.mwgroup.block.model.request.ProductInfoRequest;
import com.mwgroup.block.model.request.ProductUpdateResultVo;
import com.mwgroup.block.model.request.QueryRecommendRequest;
import com.mwgroup.block.model.ProductDetailVo;
import com.mwgroup.block.model.response.ProductListResponse;
import com.mwgroup.block.model.response.RecommendProductResponse;
import com.mwgroup.block.service.ProductBaseService;
import com.mwgroup.block.utils.VerifyParamUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 *
 * @author pcmd
 * @create 2019-11-22 13:23
 */
@Service
public class ProductFacadeService {


    @Autowired
    private ProductBaseService productBaseService;


    public ProductUpdateResultVo addProduct(ProductInfoRequest request){

        VerifyParamUtils.newCheck()
                .check(request)
                .check(request.getTitle(),request.getPeriod(),request.getRate(),request.getStock());

        ProductEntity entity = new ProductEntity();
        BeanUtils.copyProperties(request,entity);

        productBaseService.addProduct(entity);
        return new ProductUpdateResultVo(Boolean.TRUE);

    }


    public ProductListResponse queryProductList(PageQueryRequest request){

        VerifyParamUtils.newCheck()
                .check(request)
                .check(request.getPageNumber(),request.getPageSize());


        Page<Object> page = PageHelper.startPage(request.getPageNumber(), request.getPageSize(), true);
        List<ProductDetailVo> productDetailVos = productBaseService.queryProductList();
        int total = (int) page.getTotal();

        return new  ProductListResponse(total,productDetailVos);
    }



    public ProductDetailVo getProductDetail(ProductInfoRequest request){

        VerifyParamUtils.newCheck()
                .check(request)
                .check(request.getPid());


        return productBaseService.getProductDetailVo(request.getPid());
    }


    public RecommendProductResponse getRecommendProduct(QueryRecommendRequest request){

        VerifyParamUtils.newCheck()
                .check(request);


        ProductDetailVo recommendProduct = productBaseService.getRecommendProduct();

        RecommendProductResponse response = new RecommendProductResponse();
        BeanUtils.copyProperties(recommendProduct,response);

        return response;



    }



}
