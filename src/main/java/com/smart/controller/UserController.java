package com.smart.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.smart.dao.UserRepository;
import com.smart.entities.User;

@Controller
@RequestMapping(value = "/user/")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/index")
public String dashboard(Model model,Principal principal)
{
		String userName=principal.getName();
		User user=userRepository.getUserByUserName(userName);
		System.out.println(user);
	return "normal/user_dashboard";
}
}
