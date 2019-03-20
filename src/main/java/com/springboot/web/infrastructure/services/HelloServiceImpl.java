package com.springboot.web.infrastructure.services;

import org.springframework.stereotype.Service;

import com.springboot.web.domain.services.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public void hello(String message) {
		System.out.println("Hello," + message);
	}

}
