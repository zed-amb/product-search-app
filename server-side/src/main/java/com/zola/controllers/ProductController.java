package com.zola.controllers;


import com.zola.dto.ProductSearchResultDTO;
import com.zola.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search-all")
    public ResponseEntity<List<ProductSearchResultDTO>> searchAllProducts(@RequestParam String keyword) {
        List<ProductSearchResultDTO> results = productService.searchAllTables(keyword);
        return ResponseEntity.ok(results);
    }


}
