package com.kaaner.hw3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Hw3Application {

	public static void main(String[] args) {
		SpringApplication.run(Hw3Application.class, args);
	}

}
