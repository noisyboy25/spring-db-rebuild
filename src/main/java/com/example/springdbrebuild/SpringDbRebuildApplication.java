package com.example.springdbrebuild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringDbRebuildApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDbRebuildApplication.class, args);
	}

}
