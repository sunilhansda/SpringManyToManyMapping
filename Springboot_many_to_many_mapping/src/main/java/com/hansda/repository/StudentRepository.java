package com.hansda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hansda.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
