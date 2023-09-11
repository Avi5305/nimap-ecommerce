package com.nimap.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nimap.ecommerce.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // You can add custom query methods here if needed
    // For example, find products by category ID
    List<Product> findByCategoryId(Long categoryId);
}

