package com.core.model;

public class Student implements Comparable<Student>{
	
	private int stdId;
	private String stdName;
	private String desc;
	private float salary;
	
	public Student() {
	}
	
	public Student(int stdId, String stdName, String desc, float salary) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.desc = desc;
		this.salary = salary;
	}

	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		
		int hash = 5;
        hash = hash + (this.stdName != null ? this.stdName.hashCode() : 0);
        hash = (int) (hash + this.salary);
        hash = hash + this.stdId;
        return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || this.getClass() != obj.getClass()){
			return false;
		}
		Student other = (Student) obj;

		return  
				this.stdId == other.stdId 
				&& this.stdName == other.stdName && 
				this.salary == other.salary ;
	}
	
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", descgshsg=" + desc + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(o.getStdId() > this.getStdId()) {
			return -1;
		} else if(o.getStdId() < this.getStdId()) {
			return 1;
		} else {
			if(o.getStdName().compareTo(this.getStdName()) > 0) {
				return -1;
			} else if(o.getStdName().compareTo(this.getStdName()) < 0) {
				return 1;
			} else {
				if(o.getDesc().compareTo(this.getDesc()) > 0) {
					return -1;
				} else if(o.getDesc().compareTo(this.getDesc()) < 0) {
					return 1;
				} else {
					if(o.getSalary() > this.getSalary()) {
						return -1;
					} else if(o.getSalary() < this.getSalary()) {
						return 1;
					} else {
						return 0;
					}
				}
			}
		}
	}
}
