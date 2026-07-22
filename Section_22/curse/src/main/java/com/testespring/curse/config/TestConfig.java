package com.testespring.curse.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.testespring.curse.entites.Category;
import com.testespring.curse.entites.Order;
import com.testespring.curse.entites.OrderItem;
import com.testespring.curse.entites.Product;
import com.testespring.curse.entites.User;
import com.testespring.curse.entites.enums.OrderStatus;
import com.testespring.curse.repositories.CategoryRepository;
import com.testespring.curse.repositories.OrderItemRepository;
import com.testespring.curse.repositories.OrderRepository;
import com.testespring.curse.repositories.ProductRepository;
import com.testespring.curse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository; 

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {
        
        Category c1 = new Category(null, "Computer");
        Category c2 = new Category(null, "Books");
        Category c3 = new Category(null, "Eletronics");

        Product p1 = new Product(null, "Pc", "tes", 1000.00, "");
        Product p2 = new Product(null, "mouse", "tes", 220.00, "");
        Product p3 = new Product(null, "keyboard", "tes", 200.00, "");
        Product p4 = new Product(null, "monitor", "tes", 500.00, "");
        Product p5 = new Product(null, "mousepad", "tes", 20.00, "");
         
        categoryRepository.saveAll(Arrays.asList(c1,c2,c3));
        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

        p1.getCategories().add(c2);
        p2.getCategories().add(c1);
        p2.getCategories().add(c3);
        p3.getCategories().add(c3);
        p4.getCategories().add(c3);
        p5.getCategories().add(c2);

        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));

        User u1 = new User(null, "maria", "maria@gmail.com", "99999999", "123456");
        User u2 = new User(null, "Bob", "bob@gmail.com", "9888888", "123457");

        userRepository.saveAll(Arrays.asList(u1,u2));


        Order o1 = new Order(null, Instant.parse("2026-06-16T15:15:10Z"), OrderStatus.WAITING_PAYMENT,u1);
        Order o2 = new Order(null, Instant.parse("2026-06-16T15:15:20Z"), OrderStatus.CANCELED, u1);
        Order o3 = new Order(null, Instant.parse("2026-06-16T15:15:30Z"), OrderStatus.DELIVERED, u2);
        Order o4 = new Order(null, Instant.parse("2026-06-16T15:15:40Z"), OrderStatus.PAID, u2);

        orderRepository.saveAll(Arrays.asList(o1,o2,o3,o4));

        OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
        OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
        OrderItem oi3 = new OrderItem(o2, p3, 3, p3.getPrice());
        OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1,oi2,oi3,oi4));


    }

}
