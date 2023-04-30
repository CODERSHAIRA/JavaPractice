package com.kashish.tutorial.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeginnerController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "My name is Kashish and I am a beginner st Springboot";
	}

}
