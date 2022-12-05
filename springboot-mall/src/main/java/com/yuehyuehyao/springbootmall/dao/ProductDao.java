package com.yuehyuehyao.springbootmall.dao;

import com.yuehyuehyao.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
