package com.hansda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hansda.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
