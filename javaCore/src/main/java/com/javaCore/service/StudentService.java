package com.javaCore.service;

import java.util.List;

import com.javaCore.dao.IStudentDao;
import com.javaCore.dao.StudentDao;
import com.javaCore.model.Student;

public class StudentService implements IStudentService {
	
	private final IStudentDao studentDao;
	public StudentService() {
		studentDao = new StudentDao();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

	@Override
	public List<Student> getStudents() {
		return studentDao.getStudents();
	}

	@Override
	public Student getStudent(int id) {
		return studentDao.getStudent(id);
	}

}
