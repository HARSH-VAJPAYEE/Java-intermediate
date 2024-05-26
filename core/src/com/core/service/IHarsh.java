package com.core.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.core.model.Student;

public interface IHarsh {

	public void addStudentInList(Student student);
	public void addStudentInSet(Student student);
	public void addStudentInMap(String key, Student student);

	public List<Student> getStudentsFronList();
	public Set<Student> getStudentsFronSet();
	public Map<String, Student> getStudentsFronMap();
}
