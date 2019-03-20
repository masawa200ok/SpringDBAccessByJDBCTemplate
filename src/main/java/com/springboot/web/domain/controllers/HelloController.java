package com.springboot.web.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.domain.services.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService service;
	
	@GetMapping("/hello")
	public void hello(@RequestParam String message) {
		service.hello(message);
	}
}
