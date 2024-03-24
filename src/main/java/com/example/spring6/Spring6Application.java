package com.example.spring6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.spring6.service.HelloService;
import com.example.spring6.service.MessageService;

@SpringBootApplication
public class Spring6Application {
	@Bean
	MessageService messageService(){
		return new HelloService();
	}
	public static void main(String[] args) {
		SpringApplication.run(Spring6Application.class, args);
//		var content = new AnnotationConfigApplicationContext(Spring6Application.class);
//		var service = content.getBean(MessageService.class);
//		System.out.println("service = " + service.getMessage());
	}

}
