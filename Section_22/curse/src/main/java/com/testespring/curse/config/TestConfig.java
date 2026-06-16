package com.testespring.curse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.testespring.curse.entites.User;
import com.testespring.curse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        
        User u1 = new User(null, "maria", "maria@gmail.com", "99999999", "123456");
        User u2 = new User(null, "Bob", "bob@gmail.com", "9888888", "123457");

        userRepository.saveAll(Arrays.asList(u1,u2));

    }


    
}
