package com.hansda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hansda.entity.Course;
import com.hansda.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public List<Course> getAllCourses(){
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses :: add);
		return courses;
	}
}
