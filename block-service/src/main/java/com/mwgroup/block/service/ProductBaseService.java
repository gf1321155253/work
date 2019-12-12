package com.mwgroup.block.service;


import com.mwgroup.block.dao.ProductDao;
import com.mwgroup.block.entity.ProductEntity;
import com.mwgroup.block.model.ProductDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 * baseService
 *
 * @author pcmd
 * @create 2019-11-22 22:45
 */
@Service
public class ProductBaseService {
    @Autowired
    private ProductDao productDao;

    public int addProduct(ProductEntity productEntity) {
        return productDao.addProduct(productEntity);
    }


    /**
     * 分页查询算力
     * @return
     */
    public List<ProductDetailVo> queryProductList(){
        return productDao.queryProductList();
    }


    /**
     * 获取推荐算力
     * @return
     */
    public ProductDetailVo getRecommendProduct(){

        return productDao.getRecommendProduct();


    }


    /**
     * 查询算力详情
     * @param pid
     * @return
     */
    public ProductDetailVo getProductDetailVo(Long pid){
        return productDao.getProductDetailVo(pid);
    }


}
