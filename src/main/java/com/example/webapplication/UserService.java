package com.example.webapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class UserService {

	@Autowired
	private UserProxy UP;
	
	public User saveUser(User user) {
        User savedUser;

            savedUser = UP.creatUser(user);
        return savedUser;
    }

	public User getUser(String id) {
        return UP.getUser();
    }
	
	
}
