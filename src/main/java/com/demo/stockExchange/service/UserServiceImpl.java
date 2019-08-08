package com.demo.stockExchange.service;

import com.demo.stockExchange.dao.UserDao;
import com.demo.stockExchange.dao.UserDaoImpl;
import com.demo.stockExchange.model.User;

public class UserServiceImpl implements UserService {

	UserDao dao;
	@Override
	public int registerUser(User user) {
		dao=new UserDaoImpl();
		int result=dao.registerUser(user);
		return result;
	}

}
