package com.harsh.servletDemo.doa;

import java.sql.*;
import java.util.*;

import com.harsh.servletDemo.Utility.DatabaseUtility;
import com.harsh.servletDemo.model.User;

public class UserDoa {
	Connection con = null;

	public User SaveUser(User user) {
		try {
			con = DatabaseUtility.getConnection();
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO student2(email,Fname,lname) Values('"+ user.getEmail()+"','"+
					user.getFname()+"','"+ user.getLname()+"')";
			System.out.println("SQL QUERY "+sql);
			stmt.executeUpdate(sql);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<User>getUser(){
		List<User> list= new ArrayList<User>();
		try {
			con = DatabaseUtility.getConnection();
			Statement stmt= con.createStatement();
			String query = "select * from student2";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next())
			{
				System.out.println("==6==");
				String Email = rs.getString("email");
				System.out.println("==7==");
				String Fname = rs.getString("Fname");
				System.out.println("==8==");
				String Lname = rs.getString("lname");
				System.out.println("==9==");
				User user= new User();
				System.out.println("==10==");
				user.setEmail(Email);
				System.out.println("==11==");
				user.setFname(Fname);
				System.out.println("==12==");
				user.setLname(Lname);
				System.out.println("==13==");
				list.add(user);
				System.out.println("==14==");
			} 
			stmt.close();
			System.out.println("==15==");

		} catch( SQLException sql ) {
			System.out.println("==16==");
			
		}
		System.out.println("==17==");
		return list;
	}

	public User getUser(String Email) {
		User user = null;
		try {
			con = DatabaseUtility.getConnection(); 
			Statement stmt =con.createStatement(); 
			String query = "select * from student2 where Email ="+Email;
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next())
			{
				String email = rs.getString("email");
				String Fname = rs.getString("fname");
				String Lname = rs.getString("lname");


				user = new User();

				user.setEmail(email);
				user.setFname(Fname);
				user.setLname(Lname);
				break;
			}
			stmt.close();

		} catch(SQLException sqle) {

		}
		return user;
	}


}

