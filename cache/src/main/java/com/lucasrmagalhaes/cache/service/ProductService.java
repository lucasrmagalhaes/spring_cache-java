package com.lucasrmagalhaes.cache.service;

import com.lucasrmagalhaes.cache.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public String listAll() {
        log.info("c=ProductService, m=listAll");
        return "products";
    }
}
