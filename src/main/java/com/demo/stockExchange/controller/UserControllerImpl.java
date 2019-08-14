package com.demo.stockExchange.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.stockExchange.model.User;
import com.demo.stockExchange.service.UserService;

@Controller
public class UserControllerImpl implements UserController {

	@Autowired
	UserService service;

	@RequestMapping("/signup")
	public String start(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "userSignup";
		
	}
	@PostMapping("/registeruser")
	public String registerUser(@ModelAttribute("user") @Valid User user,BindingResult bindingresult,Model model) {
		
		if(bindingresult.hasErrors())
		{
			return "userSignup";
		}
		else
		{
			User result=service.registerUser(user);
			if(result !=null)
			 {
				 	return "userSignin";
			 }
			 else
			 {
				 	return "error";
			 }
		}
		
	}
}
