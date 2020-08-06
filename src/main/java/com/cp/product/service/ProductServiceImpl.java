package com.cp.product.service;

import com.cp.product.mapper.ProductMapper;
import com.cp.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getProductById(long id) {
        Product product = this.productMapper.getProductById(id);

        return product;
    }
}
