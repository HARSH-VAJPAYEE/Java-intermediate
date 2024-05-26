package com.harsh.Registration.Utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseuTility {
	public static Connection getConnection(){
		Connection con= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con = DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/test","root","2019006296");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
	}
