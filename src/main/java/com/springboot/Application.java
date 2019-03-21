package com.springboot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Autowired
//	JdbcTemplate jdbc;
//	
//	public void run(String... args) {
//		jdbc.execute("create table fruits (id serial, name varchar)");
//		List<Map<String, Object>> list = jdbc.queryForList("select * from fruits");
//		
//		list.stream()
//			.forEach(map -> System.out.println(map.get("id")));
//	}
}
