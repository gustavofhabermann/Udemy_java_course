package com.testespring.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespring.curse.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
 