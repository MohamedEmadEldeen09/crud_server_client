package com.dataapi.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dataapi.restdemo.Oop.User;

@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
		System.out.println("hello world");
		
		//--------------------------------------------------
		//test oop
		User user = new User("at@gmail.com" , "mohamed" , "ahmed");		
		User.department = "IT";
		
		String fullName = user.getFullName();	
		System.out.println(fullName);
		user.setPassWord("gr25rg8");
		System.out.println(user.getEmail());
		System.out.println(user.getPassWord());

		User.TestStaticClass st = new User.TestStaticClass();
		st.displayDepartment();
		
	}

}
