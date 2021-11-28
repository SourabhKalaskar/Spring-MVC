package com.controller.registration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

	@RequestMapping("registration")
	public String m2() {

		System.out.println("Home Controller for registration page");

		return "registration";

	}
}
