package com.testespring.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespring.curse.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
