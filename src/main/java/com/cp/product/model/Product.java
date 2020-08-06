package com.cp.product.model;

import lombok.*;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Alias("product")
public class Product implements Serializable {
    private long id;
    private String name;
    private String imageUrl;
    private int supplyPrice;
    private int salePrice;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder
    public Product(long id, LocalDateTime createdAt, LocalDateTime updatedAt, String name, String imageUrl, int supplyPrice, int salePrice) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
        this.imageUrl = imageUrl;
        this.supplyPrice = supplyPrice;
        this.salePrice = salePrice;
    }
}
