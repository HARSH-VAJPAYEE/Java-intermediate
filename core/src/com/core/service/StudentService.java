package com.core.service;

import java.util.ArrayList;
import java.util.List;

import com.core.model.Student;

public class StudentService extends StudentData implements IStudentService {

	List<Student> list = new ArrayList<Student>();
	
	@Override
	public Student addStudent(Student std) {
		list.add(std);
		return std;
	}

	@Override
	public Student getStudent(int stdId) {
		return list.get(0);
	}

	@Override
	public Student updateStudent(Student std) {
		return null;
	}

	@Override
	public Student deleteStudent(int stdId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sum2() {
		// TODO Auto-generated method stub
		
	}

}
