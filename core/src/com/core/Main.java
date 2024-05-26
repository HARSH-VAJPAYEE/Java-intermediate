package com.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.core.model.Student;
import com.core.service.IStudentService;
import com.core.service.StudentService;
import com.core.service.StudentService2;
import com.core.service.StudentService3;
import com.core.utility.UitlityData;

public class Main {
	public static void main(String[] args) {
		Student std = new Student();
		std.setStdId(1);
		std.setStdName("Pradep");
		std.setDesc("ABC");
		std.setSalary(100);
		
		Student std1 = new Student();
		std1.setStdId(2);
		std1.setStdName("Praveen");
		std1.setDesc("XYZ");
		std1.setSalary(1001);
		
		Student std2 = new Student();
		std2.setStdId(3);
		std2.setStdName("Jyoti");
		std2.setDesc("ABC");
		std2.setSalary(1002);
		
		Student std3 = new Student();
		std3.setStdId(4);
		std3.setStdName("Bhanu");
		std3.setDesc("XYZ");
		std3.setSalary(1003);
		
		Student std4 = new Student();
		std4.setStdId(1);
		std4.setStdName("Pradap");
		std4.setDesc("XYZ");
		std4.setSalary(100);
		
		Student std5 = new Student();
		std5.setStdId(2);
		std5.setStdName("Pravaen");
		std5.setDesc("ABC");
		std5.setSalary(1001);
		
		Student std6 = new Student();
		std6.setStdId(3);
		std6.setStdName("Jyoty");
		std6.setDesc("ABC");
		std6.setSalary(1002);
		
		Student std7 = new Student();
		std7.setStdId(4);
		std7.setStdName("Bhana");
		std7.setDesc("XYZ");
		std7.setSalary(1003);
		
		Student std8 = new Student();
		std8.setStdId(1);
		std8.setStdName("Pradep");
		std8.setDesc("XYZ");
		std8.setSalary(100);
		
		List<Student> set = new ArrayList<Student>();
		set.add(std);
		set.add(std1);
		set.add(std2);
		set.add(std3);
		set.add(std4);
		set.add(std5);
		set.add(std6);
		set.add(std7);
		set.add(std8);
		Collections.sort(set);
		
		/*Collections.sort(set, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getStdId() < o2.getStdId()) {
					return -1;
				} else if(o1.getStdId() > o2.getStdId()) {
					return 1;
				} else {
					if(o1.getStdName().compareTo(o2.getStdName()) > 0) {
						return 1;
					} else if(o1.getStdName().compareTo(o2.getStdName()) < 0) {
						return -1;
					} else {
						if(o1.getDesc().compareTo(o2.getDesc()) > 0) {
							return 1;
						} else if(o1.getDesc().compareTo(o2.getDesc()) < 0) {
							return -1;
						} else {
							if(o1.getSalary() > o2.getSalary()) {
								return -1;
							} else if(o1.getSalary() > o2.getSalary()) {
								return 1;
							} else {
								return 0;
							}
						}
					}
				}
			}
		});*/
		
		for (Student student : set) {
			System.out.println(student);
		}
		
		System.out.println("SOZE "+set.size());
		
		
		
		/*IStudentService ss = new StudentService();
		ss.addStudent(std3);
		
		System.out.println(ss.getStudent(0));
		
		
		
		IStudentService sss = new StudentService2();
		sss.addStudent(std3);
		
		
		System.out.println(UitlityData.DATA);
		System.out.println(sss.getStudent(0));
		
		
		
		System.out.println(std2);

		
		
		//StudentService3 service3 = new StudentService();
		StudentService service = new StudentService3();
		
		System.out.println(std.hashCode());
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(std3.hashCode());*/
	}
}
