package com.dataapi.restdemo.Oop;


public class User extends Person{

	 public String email ;	 
	 private String passWord ;
	 
	 //static property
	 public static String department = "Default";
	 
	 
	 public User(String email , String firstName , String lastName) {
		 this.email = email;
		 this.firstName =  firstName;
		 this.lastName =  lastName;
	 }
	 
	 
	 //copy constructor
	 public User(User user) {
		 this.firstName =  user.firstName;
		 this.lastName =  user.lastName;
		 this.email = user.email;
	 }
	 
	 
	//override
	@Override
	public String getFullName() {		
		return this.firstName +" "+ this.lastName;
	}

	//setters - getters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	//
	
	
	//static class
    public static class TestStaticClass{
    	
    	public void displayDepartment() {
			System.out.println(department);
		}
    }
    
}
