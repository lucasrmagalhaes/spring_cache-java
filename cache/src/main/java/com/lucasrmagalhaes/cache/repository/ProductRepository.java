package com.lucasrmagalhaes.cache.repository;

import com.lucasrmagalhaes.cache.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Slf4j
public class ProductRepository {

    public List<Product> listAll() {
        log.info("c=ProductRepository, m=listAll");

        // Builder
        final Product product = Product.builder()
                .sku("Produto")
                .price(new BigDecimal(("10.50")))
                .description("Produto Descrição")
                .build();

        List<Product> products = List.of(product);

        return products;
    }
}
