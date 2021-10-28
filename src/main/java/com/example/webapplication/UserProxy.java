package com.example.webapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserProxy {
	
	@Autowired
	private CustomProperties CP;
	
	
	 public User getUser() {
	        String baseApiUrl = CP.getApiUrl();
	        String getuserUrl = baseApiUrl + "/compte";

	        RestTemplate restTemplate = new RestTemplate();
	        ResponseEntity<User> response = restTemplate.exchange(
	        		"Http://localhost:3000/compte",
	                HttpMethod.GET,
	                null,
	                new ParameterizedTypeReference<User>() {}
	                );
	        return response.getBody();
	    }
	
	public User creatUser(User u) {
		
		String baseapiurl=CP.getApiUrl();
		String userUrl= baseapiurl + "/User";
		
		RestTemplate restTemplate= new RestTemplate();
		HttpEntity<User> request = new HttpEntity<User>(u);
		
		ResponseEntity<User> response = restTemplate.exchange(
		        userUrl,
		        HttpMethod.POST,
		        request,
		        User.class);
		
		return response.getBody();
	}

	public void deleteUser(String email) {
		
		
	}

}
