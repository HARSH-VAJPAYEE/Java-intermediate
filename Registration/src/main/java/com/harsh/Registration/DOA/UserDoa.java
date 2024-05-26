package com.harsh.Registration.DOA;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.harsh.Registration.Utility.DataBaseuTility;
import com.harsh.Registration.model.User;

public class UserDoa {
    Connection con=null;
    
    public User saveUser(User user) {
    	try {
    	con=DataBaseuTility.getConnection();
    	Statement stmt= con.createStatement();
    	String sql="INSERT INTO Registration3(Name,PhoneNumber,Email) values ('"+ user.getName()+"','"+user.getPhoneNumber()+
    			"','"+user.getEmail()+"')";
    	System.out.println("SQL QUERY "+sql);
		stmt.executeUpdate(sql);}
       catch(Exception e) {
		e.printStackTrace();}
	return null; }
    public List<User> getUser(){
    	List<User> list=new ArrayList<User>();
    	try {
    	con = DataBaseuTility.getConnection();
		Statement stmt= con.createStatement();
		String query = "select * from Registration3";
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			String Name=rs.getString("Name");
			String PhoneNumber=rs.getString("PhoneNumber");
			String Email=rs.getString("Email");
			User user=new User();
			user.setName(Name);
			user.setPhoneNumber(PhoneNumber);
			user.setEmail(Email);
			list.add(user);}
		stmt.close();
		}catch(SQLException sql) {
			}
    	return list;
    }
    
    public User getUser(String name) {
    	User user=null;
    	try {
    		con=DataBaseuTility.getConnection();
    		Statement stmt=con.createStatement();
    		String Sql="Select * from Registration3 where Name="+ name;
    		ResultSet rs=stmt.executeQuery(Sql);
    		while(rs.next()) {
    			String Name=rs.getString("Name");
    			String PhoneNumber=rs.getString("PhoneNumber");
    			String Email=rs.getString("Email");
    			 user=new User();
    			 user.setName(Name);
    			 user.setPhoneNumber(PhoneNumber);
    			 user.setEmail(Email);
    			 break;
    		}
    		stmt.close();
    		
    	}catch (Exception e) {}
    	return user;
    }
    
}
