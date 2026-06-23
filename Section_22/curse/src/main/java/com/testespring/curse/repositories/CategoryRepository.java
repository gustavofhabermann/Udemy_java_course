package com.testespring.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespring.curse.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
