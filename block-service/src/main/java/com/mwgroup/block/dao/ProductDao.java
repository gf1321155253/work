package com.mwgroup.block.dao;

import com.mwgroup.block.entity.ProductEntity;
import com.mwgroup.block.model.ProductDetailVo;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 描述:
 * 算力 dao
 *
 * @author pcmd
 * @create 2019-11-22 22:09
 */
@Mapper
public interface ProductDao {

    /**添加算力*/
    int addProduct(@Param("product") ProductEntity entity);


    /**
     * 获取算力列表
     * @return
     */
    List<ProductDetailVo> queryProductList();

    /**
     * 获取推荐算力
     * @return
     */
    ProductDetailVo getRecommendProduct();


    /**
     * 获取算力详情
     * @param pid
     * @return
     */
    ProductDetailVo getProductDetailVo(@Param("pid")Long pid);
}
