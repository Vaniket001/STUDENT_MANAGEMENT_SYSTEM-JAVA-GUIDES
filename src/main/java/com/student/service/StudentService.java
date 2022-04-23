package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {
	public List<Student> getAllStudents();

	public Student saveStudent(Student student);
	
	public Student getStudent(Long id);
	
	public Student updateStudent(Student student);

}
