package com.lucasrmagalhaes.cache.resource;

import com.lucasrmagalhaes.cache.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@Slf4j
public class ProductResource {

    private final ProductService productService;

    @GetMapping("/")
    public String listAll() {
        log.info("c=ProductResource, m=listAll");
        return productService.listAll();
    }

}
