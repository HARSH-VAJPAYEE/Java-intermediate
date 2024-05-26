package com.javaCore.dao;

import java.util.List;

import com.javaCore.model.Student;

public interface IStudentDao {
	public Student saveStudent(Student student);
	public List<Student> getStudents();
	public Student getStudent(int id);
	
}
