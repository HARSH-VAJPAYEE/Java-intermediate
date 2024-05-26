package com.harsh.example1.model;

public class ExModel {
	private String StName;
	private String Email;
	
	
	public String getStName() {
		return StName;
	}
	public void setStName(String StName) {
		this.StName = StName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	@Override
	public String toString() {
		return "Name : "+ StName + "Email: "+ Email;
	}

}
