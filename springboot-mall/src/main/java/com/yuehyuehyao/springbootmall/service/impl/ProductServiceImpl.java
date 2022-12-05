package com.yuehyuehyao.springbootmall.service.impl;

import com.yuehyuehyao.springbootmall.dao.ProductDao;
import com.yuehyuehyao.springbootmall.model.Product;
import com.yuehyuehyao.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return  productDao.getProductById(productId);
    }
}
