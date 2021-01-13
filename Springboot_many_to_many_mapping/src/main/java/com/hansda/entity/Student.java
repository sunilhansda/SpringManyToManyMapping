package com.hansda.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "students_courses", 
	joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"))
	private Set<Course> likedCourses;

	public Student() {
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Course> getLikedCourses() {
		return likedCourses;
	}
	
	public void setLikedCourses(Set<Course> likedCourses) {
		this.likedCourses = likedCourses;
	}
	
}
