package com.dataapi.restdemo.Ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dataapi.restdemo.Models.Users;

public interface UserRepo extends JpaRepository<Users, Long>{
	
} 

