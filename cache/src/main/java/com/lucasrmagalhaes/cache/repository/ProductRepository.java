package com.lucasrmagalhaes.cache.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductRepository {

    public String listAll() {
        log.info("c=ProductRepository, m=listAll");
        return "products";
    }
}
