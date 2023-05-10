package com.dataapi.restdemo.Models;

import java.util.ArrayList;

public class User {

	private  int id = 0;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	public static ArrayList<User> AllUsers = new ArrayList<User>();
	
	public User() {}
	public User(String firstName, String lastName, String email, String password) {
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Password = password;
		this.id = this.id + 1;
		AllUsers.add(this);
		this.id+=1;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	
	
}

