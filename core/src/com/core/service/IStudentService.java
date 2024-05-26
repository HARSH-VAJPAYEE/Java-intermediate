package com.core.service;

import java.util.List;

import com.core.model.Student;

public interface IStudentService {
	public Student addStudent(Student std);
	public Student getStudent(int stdId);
	public List<Student> getStudents();
	public Student updateStudent(Student std);
	public Student deleteStudent(int stdId);
}
