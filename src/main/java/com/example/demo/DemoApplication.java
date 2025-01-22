package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args); //delete al and just use this to run all


		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		// Get the bean from the context
		ComponentServiceRepository test1 = context.getBean(ComponentServiceRepository.class);

		// Call the output method
		test1.output();  // This will print "This is return"


	}

}
