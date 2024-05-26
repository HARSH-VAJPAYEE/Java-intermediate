package com.core;

import java.util.Map.Entry;

import com.core.model.Student;
import com.core.service.Harsh;
import com.core.service.IHarsh;

public class Collection {
	public static void main(String[] args) {
		IHarsh harsh = new Harsh();
		
		Student student = new Student();
		student.setStdId(1);
		student.setStdName("P");
		student.setSalary(10.00f);
		student.setDesc("SE");
		
		Student student1 = new Student();
		student1.setStdId(2);
		student1.setStdName("R");
		student1.setSalary(10.00f);
		student1.setDesc("SE");
		
		Student student2 = new Student(3, "A", null, 10.00f);
		
		Student student3 = new Student();
		student3.setStdId(4);
		student3.setStdName("D");
		student3.setSalary(10.00f);
		
		Student student4 = new Student();
		student4.setStdId(5);
		student4.setStdName("E");
		student4.setSalary(10.00f);
		student4.setDesc("SE");
		

		harsh.addStudentInList(student);
		harsh.addStudentInList(student1);
		harsh.addStudentInList(student2);
		harsh.addStudentInList(student3);
		harsh.addStudentInList(student4);
		

		harsh.addStudentInSet(student);
		harsh.addStudentInSet(student1);
		harsh.addStudentInSet(student2);

		harsh.addStudentInMap("P", student);
		harsh.addStudentInMap("R", student1);
		harsh.addStudentInMap("A", student2);
		harsh.addStudentInMap("D", student3);

		
		for (Student s : harsh.getStudentsFronList()) {
			System.out.println("LIST "+s.toString());
		}
		
		for (Student s : harsh.getStudentsFronSet()) {
			System.out.println("SET "+s.toString());
		}
		

		for (Entry<String, Student> s : harsh.getStudentsFronMap().entrySet()) {
			System.out.println("MAP KEY "+s.getKey());
			System.out.println("MAP VALUE "+s.getValue().toString());
		}
	}
}
