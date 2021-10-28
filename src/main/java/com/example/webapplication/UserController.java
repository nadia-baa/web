package com.example.webapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@Autowired
	UserService US;
    
	@GetMapping("/inscrire")
	public String home() { 
	    return "inscrire";
	}
	
	@GetMapping("/mon compte")
	public String home(Model model) {
	    User monuser = US.getUser("1");
	    model.addAttribute("user", monuser);
	    
	    return "compte";
	}
	    

	}

