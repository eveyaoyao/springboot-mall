package com.yuehyuehyao.springbootmall.service;

import com.yuehyuehyao.springbootmall.dto.ProductRequest;
import com.yuehyuehyao.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

}
