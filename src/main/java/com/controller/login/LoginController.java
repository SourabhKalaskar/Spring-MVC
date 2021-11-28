package com.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String m1() {

		System.out.println("Home Controller for login page");

		return "login";

	}

	
	
	
	
}
