package com.dataapi.restdemo.Ropository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dataapi.restdemo.Models.Courses;

public interface CoursesRepo extends JpaRepository<Courses, Long> {

}
