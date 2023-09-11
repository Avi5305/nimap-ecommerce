package com.nimap.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nimap.ecommerce.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    // You can add custom query methods here if needed
    // For example, find a category by its name
    Category findByName(String name);
}

