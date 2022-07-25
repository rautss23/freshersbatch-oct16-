package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {
	@GetMapping("/")
	public String Home()
	{
		return("<h1>welcome!</h1>");
	}

	@GetMapping("/user")
	public String User()
	{
		return("<h1>welcome! User</h1>");
	}
	
	@GetMapping("/admin")
	public String Admin()
	{
		return("<h1>welcome! Admin</h1>");
	}
}
