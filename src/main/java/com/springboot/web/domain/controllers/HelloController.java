package com.springboot.web.domain.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.domain.services.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService service;
	
	@GetMapping("/hello")
	public void hello(@RequestParam Optional<String> message) {
		service.hello(message.orElse("Who are you?"));
	}
	
	@Autowired
	JdbcTemplate jdbc;
	
	@GetMapping("/showusers")
	public void showUsers() {
		
		List<Map<String, Object>> list = jdbc.queryForList("select * from users");
		
		list.stream()
			.forEach(map -> System.out.println(map.get("id") + ":" + (String) map.get("name")));
	}
	
 }
