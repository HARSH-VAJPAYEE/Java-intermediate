package com.harsh.servletDemo.model;

public class User {
	private String email;
	private String fname;
	private String lname;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	
	
}
