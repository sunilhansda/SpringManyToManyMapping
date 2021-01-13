package com.hansda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hansda.entity.Student;
import com.hansda.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public List<Student> getAllStudents(){
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students :: add);
		return students;
	}
}
