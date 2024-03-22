package com.Springboot;

import org.springframework.context.ApplicationContext;

import com.Springboot.dao.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBookApiApplication {

	public static void main(String[] args) {
		 ApplicationContext context=SpringApplication.run(SpringbootBookApiApplication.class, args);
		 UserRepository us=context.getBean(UserRepository.class);
		 
	}

}
