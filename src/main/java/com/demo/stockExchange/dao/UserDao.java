package com.demo.stockExchange.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.stockExchange.model.User;

public interface UserDao extends JpaRepository<User, Integer> {
}
