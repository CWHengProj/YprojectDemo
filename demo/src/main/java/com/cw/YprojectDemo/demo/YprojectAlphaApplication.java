package com.cw.YprojectDemo.demo;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication //indicates that it is a springboot application - autoconfig and scans for other components
public class YprojectAlphaApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(YprojectAlphaApplication.class);//calls the class
		String port = "8080";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		if (cliOpts.containsOption("port")){
			port = cliOpts.getOptionValues("port").get(0);
		}
		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		System.out.printf("Starting application on %s\n",port);
		app.run(args);
	}
	@Bean
	public CommonsRequestLoggingFilter log(){
		CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
		logger.setIncludeClientInfo(true);
		logger.setIncludeQueryString(true);
		return logger;
	}
	//wait for loggers lesson

}

