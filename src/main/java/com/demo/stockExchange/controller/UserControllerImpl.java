package com.demo.stockExchange.controller;

import com.demo.stockExchange.model.User;
import com.demo.stockExchange.service.UserService;
import com.demo.stockExchange.service.UserServiceImpl;

public class UserControllerImpl implements UserController {

	UserService service=new UserServiceImpl();

	@Override
	public int registerUser(User user) {
		int result=service.registerUser(user);
		return result;
	}

}
