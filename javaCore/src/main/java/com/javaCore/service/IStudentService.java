package com.javaCore.service;

import java.util.List;

import com.javaCore.model.Student;

public interface IStudentService {
	public Student saveStudent(Student student);
	public List<Student> getStudents();
	public Student getStudent(int id);
	
}
