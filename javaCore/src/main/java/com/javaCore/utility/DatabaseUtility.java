package com.javaCore.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtility {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con =DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/test","root","2019006296");
		} catch (Exception e) {
			// TODO: handle exception
		}

		return con;
	}
}
