package com.example.productShopping.repository;


import com.example.productsShoppping.entity.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByIdAndUser_Username(Long productId, String username);
}
