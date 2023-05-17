package com.dataapi.restdemo.Models;

import jakarta.persistence.*;

@Entity
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int course_id;
	
	@Column
	private String course_name;
	
	@Column
	private int course_hours;
	
	@Column
	private String course_desc;
	
	@Column
	private String platform;
	
	
	@Column
	private String track_name;


	public int getCousre_id() {
		return course_id;
	}


	public void setCousre_id(int course_id) {
		this.course_id = course_id;
	}


	public String getCourse_name() {
		return course_name;
	}


	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}


	public int getCourse_hours() {
		return course_hours;
	}


	public void setCourse_hours(int course_hours) {
		this.course_hours = course_hours;
	}


	public String getCourse_desc() {
		return course_desc;
	}


	public void setCourse_desc(String course_desc) {
		this.course_desc = course_desc;
	}


	public String getPlatform() {
		return platform;
	}


	public void setPlatform(String platform) {
		this.platform = platform;
	}


	public String getTrack_name() {
		return track_name;
	}


	public void setTrack_name(String track_name) {
		this.track_name = track_name;
	}
	
	
}
