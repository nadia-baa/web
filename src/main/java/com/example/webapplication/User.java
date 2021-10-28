package com.example.webapplication;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {

	@Getter @Setter private int id;
	
	@Getter @Setter private String name;
	
	@Getter @Setter private int age ;
	
	@Getter @Setter private String ville;
	
	@Getter @Setter private String email;
	
	@Getter @Setter private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
