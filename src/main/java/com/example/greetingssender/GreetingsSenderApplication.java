package com.example.greetingssender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class GreetingsSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingsSenderApplication.class, args);
	}

}
