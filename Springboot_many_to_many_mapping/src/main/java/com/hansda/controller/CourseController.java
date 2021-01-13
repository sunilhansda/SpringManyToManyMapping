package com.hansda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hansda.entity.Course;
import com.hansda.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@RequestMapping(method = RequestMethod.POST, value = "/courses")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/courses")
	public List<Course> getAllCourses(){
		List<Course> courses = courseService.getAllCourses();
		return courses;
	}
}
