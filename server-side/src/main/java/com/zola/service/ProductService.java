////package com.zola.service;
////
////import com.zola.entity.Product;
////import com.zola.repository.ProductRepository;
////import org.springframework.stereotype.Service;
////
////import java.util.List;
////
////@Service
////public class ProductService {
////    private final ProductRepository productRepository;
////
////    public ProductService(ProductRepository productRepository) {
////        this.productRepository = productRepository;
////    }
////
////    public List<Product> searchProductsByKeyword(String keyword) {
////        return productRepository.searchProductsByKeyword(keyword);
////    }
////}
//
//package com.zola.service;
//
//import com.zola.entity.Product;
//import com.zola.repository.ProductRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService {
//    private final ProductRepository productRepository;
//
//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    public List<Product> searchAllTables(String keyword) {
//        return productRepository.searchAllTables(keyword);
//    }
//}
package com.zola.service;

import com.zola.dto.ProductSearchResultDTO;
import com.zola.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductSearchResultDTO> searchAllTables(String keyword) {
        return productRepository.searchProducts(keyword); // Ensure this matches the repository method
    }

}
