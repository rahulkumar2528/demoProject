package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class FirstController {
	
	@GetMapping("/home")
	public String getHomePage() {
		return "index";
	}
	@GetMapping("/save")
	public String savePage() {
		return "Register";
	}
}
