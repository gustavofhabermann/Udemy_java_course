package com.testespring.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespring.curse.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    
}