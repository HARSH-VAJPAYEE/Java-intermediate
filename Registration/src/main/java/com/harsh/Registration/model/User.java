package com.harsh.Registration.model;

public class User {
	private String Name;
	private String PhoneNumber;
	private String Email;
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber=PhoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email=Email;
	}
    @Override
    public String toString() {
    	return "Name =" + Name + "PhoneNumber ="+ PhoneNumber + "Email="+ Email;
    }
}
