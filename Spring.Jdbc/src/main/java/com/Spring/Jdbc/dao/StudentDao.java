package com.Spring.Jdbc.dao;

import java.util.List;

import com.Spring.Jdbc.entity.Student;

public interface StudentDao {

	int insert(Student student);
	int update(Student student);
	int delete(int studentId);
	Student getStudent(int studentId);
	List<Student> getAllStudent();
}
