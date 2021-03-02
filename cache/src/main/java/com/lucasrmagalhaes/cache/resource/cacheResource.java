package com.lucasrmagalhaes.cache.resource;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cache")
public class cacheResource {

    @GetMapping("/")
    @CacheEvict(value = "product-cache", key = "")
    public String clearCache() {
        return "Limpou o cache";
    }
}
