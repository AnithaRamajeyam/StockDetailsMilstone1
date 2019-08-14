package com.demo.stockExchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.stockExchange.dao.UserDao;
import com.demo.stockExchange.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao dao;
	@Override
	public User registerUser(User user) {
		User result=dao.save(user);
		return result;
	}

}
