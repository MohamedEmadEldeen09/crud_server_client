package com.dataapi.restdemo.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dataapi.restdemo.Models.Users;
import com.dataapi.restdemo.Ropository.UserRepo;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/users")   //->   http://localhost:8000/users/
public class UserController {
   
	@Autowired
	private UserRepo userRepo;
	
		
	@GetMapping(value = "getallusers") //->   http://localhost:8000/users/getallusers
	public List<Users> getTracks(){
		return userRepo.findAll();
	}
	
	@GetMapping(value = "getuser/{id}")  //->   http://localhost:8000/users/getuser/2
	public Users getTracks(@PathVariable Long id){
		return userRepo.findById(id).get();
	}
	
	
	@PostMapping(value = "adduser") //->   http://localhost:8000/users/adduser
	public String addUser(@RequestBody Users user){
		userRepo.save(user);
		return "user has saved successfully!";
	}
	
	@PutMapping(value = "updateuser/{id}") //->   http://localhost:8000/users/updateuser/1
	public String updateUser(@PathVariable Long id , @RequestBody Users user) {		
		Users targetUser=  userRepo.findById(id).get();
		targetUser.setFirstName(user.getFirstName());
		targetUser.setLastName(user.getLastName());
		targetUser.setEmail(user.getEmail());
		targetUser.setPassword(user.getPassword());
		userRepo.save(targetUser);
		return "user has updated successfully!";
	}
	
	@DeleteMapping(value = "deleteuser/{id}") //->   http://localhost:8000/users/deleteuser/2
	public String deleteUser(@PathVariable Long id) {
		Users targetUser=  userRepo.findById(id).get();
		userRepo.delete(targetUser);
		return "user has deleted successfully!";
	}
	
	
}
