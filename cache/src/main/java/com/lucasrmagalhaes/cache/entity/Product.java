package com.lucasrmagalhaes.cache.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class Product {

    private String sku;
    private BigDecimal price;
    private String description;
}
