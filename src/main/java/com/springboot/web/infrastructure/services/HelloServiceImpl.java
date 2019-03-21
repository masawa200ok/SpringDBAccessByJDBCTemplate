package com.springboot.web.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.springboot.web.domain.services.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public void hello(String message) {
		System.out.println("Hello," + message);
	}
}
