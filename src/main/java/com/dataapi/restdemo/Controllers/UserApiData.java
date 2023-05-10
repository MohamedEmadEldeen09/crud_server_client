package com.dataapi.restdemo.Controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import com.dataapi.restdemo.Models.User;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/users")
public class UserApiData {

	User user1 = new User("mohamed" , "emad" , "regverg@gmail.com" , "gerg52");
	User user2 = new User("ahmed" , "emad" , "ahg@gmail.com" , "r5214g");

	@GetMapping("getallusers")
	public ArrayList<User> getUsers() {		        
		return User.AllUsers;
	}
	@GetMapping("getallusers/user/{id}")
	public Object getUser(@PathVariable int id) {		
		
		for (int i = 0; i <User.AllUsers.size(); i++) {
			System.out.println(User.AllUsers.get(i).getId());
			if(User.AllUsers.get(i).getId() == id) {
				return User.AllUsers.get(i);
			}
		}
		return "this user not exist";
	
	}
	
	@PostMapping
	public String addUser(@RequestBody User user) {
		User.AllUsers.add(user);
		return "user has been added successfully!";
	}
	
	
	@PutMapping("{id}")
	public String addUser(@PathVariable int id  , @RequestBody User user) {
		User.AllUsers.add(user);
		
		for (int i = 0; i <User.AllUsers.size(); i++) {
			System.out.println(User.AllUsers.get(i).getId());
			if(User.AllUsers.get(i).getId() == id) {
				User.AllUsers.get(i).setEmail(user.getEmail());
				User.AllUsers.get(i).setFirstName(user.getFirstName());
				User.AllUsers.get(i).setLastName(user.getLastName());
				User.AllUsers.get(i).setPassword(user.getPassword());
			}
		}
		return "user has been updated successfully!";
	}
	
	@DeleteMapping("{id}")
	public String addUser(@PathVariable int id) {
		User.AllUsers.remove(0);
		return "user has been deleted successfully!";
	}
	
	
	
}
