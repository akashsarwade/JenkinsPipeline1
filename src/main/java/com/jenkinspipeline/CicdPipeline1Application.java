package com.jenkinspipeline;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
@RestController
public class CicdPipeline1Application {

	
	
	static Logger logger=(Logger) LoggerFactory.getLogger(CicdPipeline1Application.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application started Successfully......!");
	}
	
//	@GetMapping("/home")
//	public String Hello() {
//		return"Welcome to jenkins_Pipeline";
	
	
//	}
	
	 
	public static void main(String[] args) {
		logger.info("Application started Successfully......!");
		
		SpringApplication.run(CicdPipeline1Application.class, args);
	}

}
