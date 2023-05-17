package com.dataapi.restdemo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dataapi.restdemo.Models.Courses;
import com.dataapi.restdemo.Ropository.CoursesRepo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/courses")   //->   http://localhost:8073/courses
public class CourseController {

	@Autowired
	private CoursesRepo coursesRepo;
	
	
	@GetMapping    //->   http://localhost:8073/courses
	public List<Courses> getAllCourses(){
		return coursesRepo.findAll();
	}
	
	
}
