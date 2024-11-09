package com.cw.YprojectDemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication //indicates that it is a springboot application - autoconfig and scans for other components
public class YprojectAlphaApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(YprojectAlphaApplication.class);//calls the class
		System.out.println("Starting application on port 8080..");
		app.run(args);
	}
	/* @Bean
	public CommonsRequestLoggingFilter log(){
		CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
		logger.setIncludeClientInfo(true);
		logger.setIncludeQueryString(true);
		return logger;
	} */

}
//application.properties;//to add or not to add?
//logging.level.org.springframework.web.filter.CommonsRequestLoggingFilter= DEBUG;//to add or not to add?
