package com.core.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.core.model.Student;

public class Harsh implements IHarsh {
	
	private List<Student> list = new ArrayList<Student>();
	private Set<Student> set=new HashSet<Student>();
	private Map<String, Student> map ;
	
//	public Harsh() {
//		list = new ArrayList<Student>();
//		set = new HashSet<Student>();
//		map = new HashMap<String, Student>();
//	}

	@Override
	public void addStudentInList(Student student) {
		list.add(student);
	}

	@Override
	public void addStudentInSet(Student student) {
		set.add(student);
	}

	@Override
	public void addStudentInMap(String key, Student student) {
		map.put(key, student);
	}

	@Override
	public List<Student> getStudentsFronList() {
		return list;
	}

	@Override
	public Set<Student> getStudentsFronSet() {
		return set;
	}

	@Override
	public Map<String, Student> getStudentsFronMap() {
		return map;
	}
	
	
	

}
