package com.jenkinspipeline;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.classic.Logger;

@SpringBootTest
class CicdPipeline1ApplicationTests {

	public static Logger logger=(Logger) LoggerFactory.getLogger(CicdPipeline1Application.class);
	@Test
	void contextLoads() {
		logger.info("Test Case Executing..!");
		
	}

}
