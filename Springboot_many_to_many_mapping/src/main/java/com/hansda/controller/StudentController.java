package com.hansda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hansda.entity.Student;
import com.hansda.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/students")
	public List<Student> getAllStudents(){
		List<Student> students = studentService.getAllStudents();
		return students;
	}
}
