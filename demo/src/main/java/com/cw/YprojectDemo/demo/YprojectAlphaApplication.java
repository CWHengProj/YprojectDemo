package com.cw.YprojectDemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //indicates that it is a springboot application - autoconfig and scans for other components
public class YprojectAlphaApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(YprojectAlphaApplication.class);//calls the class
		System.out.println("Starting application on port 8080..");
		app.run(args);
	}

}
