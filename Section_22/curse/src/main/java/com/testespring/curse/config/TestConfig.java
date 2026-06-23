package com.testespring.curse.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.testespring.curse.entites.Order;
import com.testespring.curse.entites.User;
import com.testespring.curse.entites.enums.OrderStatus;
import com.testespring.curse.repositories.OrderRepository;
import com.testespring.curse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        
        User u1 = new User(null, "maria", "maria@gmail.com", "99999999", "123456");
        User u2 = new User(null, "Bob", "bob@gmail.com", "9888888", "123457");

        Order o1 = new Order(null, Instant.parse("2026-06-16T15:15:10Z"), OrderStatus.WAITING_PAYMENT,u1);
        Order o2 = new Order(null, Instant.parse("2026-06-16T15:15:20Z"), OrderStatus.CANCELED, u1);
        Order o3 = new Order(null, Instant.parse("2026-06-16T15:15:30Z"), OrderStatus.DELIVERED, u2);
        Order o4 = new Order(null, Instant.parse("2026-06-16T15:15:40Z"), OrderStatus.PAID, u2);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3,o4));


    }


    
}
