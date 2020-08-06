package com.cp.product.mapper;

import com.cp.product.model.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    Product getProductById(long id);
}
