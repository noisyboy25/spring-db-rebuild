package com.example.springdbrebuild;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SpringDbRebuildApplicationTests {

	Logger logger = LoggerFactory.getLogger(SpringDbRebuildApplicationTests.class);

	@LocalServerPort
	private int port;

	@Autowired
	TestRestTemplate restTemplate = new TestRestTemplate();

	@Test
	public void greetingShouldReturnDefaultMessage() {
		final String HTTP_LOCALHOST = "http://localhost:" + port + "/api/students/";

		logger.info(HTTP_LOCALHOST);
		logger.info(this.restTemplate.getForObject(HTTP_LOCALHOST, String.class));
		assertTrue(this.restTemplate.getForObject(HTTP_LOCALHOST, String.class).contains("[ ]"));
	}

	@Test
	void contextLoads() {
	}

}
