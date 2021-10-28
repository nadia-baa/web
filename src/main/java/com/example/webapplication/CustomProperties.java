package com.example.webapplication;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix="com.example.webapplication")
public class CustomProperties {

	private String apiUrl;
	
	public String getApiUrl() {
		apiUrl="Http://localhost:3000";
		return apiUrl;
	}
}
