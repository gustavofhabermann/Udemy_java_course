package com.testespring.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespring.curse.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}