package com.project.testApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users/")
public class UsersController {
	
	@GetMapping("admin")
	public String admin() {
		return "Welcome To Admin Panel";
	}
	
	@GetMapping("dashboard")
	public String dashboard() {
		return "Welcome Dashboard Page";
	}
	
	@GetMapping("index")
	public String index() {
		return "Welcome to Index Page";
	}
}
