package com.shalini.springboot.springdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class SpringdockerApplication {

	@GetMapping(value = "/hello")
	public String sayHello(){
		return "Hello from Docker";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringdockerApplication.class, args);
	}
}
