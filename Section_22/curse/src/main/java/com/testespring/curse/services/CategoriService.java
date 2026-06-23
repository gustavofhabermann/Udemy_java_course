package com.testespring.curse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testespring.curse.entites.Category;
import com.testespring.curse.repositories.CategoryRepository;

@Service
public class CategoriService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    } 

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
    
}
