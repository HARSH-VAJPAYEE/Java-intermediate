package com.javaCore.main;

import java.util.List;

import com.javaCore.model.Student;
import com.javaCore.service.IStudentService;
import com.javaCore.service.StudentService;

public class Main {
	public static void main(String[] args) {
		/*
		 * Student student = new Student(); student.setStudentId(300);
		 * student.setCity("Mumbai"); student.setStudentName("Pradeep");
		 * student.setState("Mumbai")
		 */;
		
		IStudentService studentService = new StudentService();
		/*
		 * studentService.saveStudent(student);
		 * 
		 * System.out.println(student);
		 */
		
		List<Student> list = studentService.getStudents();
		
		for (Student student : list) {
			System.out.println(student);
		}
		
		Student student = studentService.getStudent(2);
		System.out.println("==========================");
		System.out.println(student);
	}
}
