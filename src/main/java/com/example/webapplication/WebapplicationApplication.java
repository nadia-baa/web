package com.example.webapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebapplicationApplication implements CommandLineRunner {

	@Autowired
	private CustomProperties CP;
	public static void main(String[] args) {
		SpringApplication.run(WebapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(CP.getApiUrl());
		
	}

}
