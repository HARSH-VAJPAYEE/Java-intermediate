package com.harsh.example1.Doa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.harsh.example1.model.ExModel;
import com.harsh.example1.dataUtility.*;

public class DoaEx {
	Connection con= null;
	private String StName;

	public ExModel save(ExModel exModel) {
		try {
			con = DatabaseUtility.getConnection();
			Statement stmt= con.createStatement();
			String Sql="INSERT INTO Example(St_Name,Email) Values('"+exModel.getStName()+"' , '"+exModel.getEmail()+"')";
			System.out.println("SQL QUARY "+ Sql);
			stmt.executeUpdate(Sql);
		} catch(Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public ExModel get() {
		ExModel exModel= null;
		try {
			con=DatabaseUtility.getConnection();
			Statement stmt=con.createStatement();
			String sql="Select * from Example";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				String StName=rs.getString("StName");
				String Email= rs.getString("Email");

				exModel=new ExModel();
				exModel.setEmail(Email);
				exModel.setStName(StName);
				break;
			}
			stmt.close();

		}catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return exModel;
	}

	public List<ExModel>getList(){
		List<ExModel> list= new ArrayList<ExModel>();
		ExModel exModel= null;

		try {
			con=DatabaseUtility.getConnection();
			Statement stmt=con.createStatement();
			String sql="Select * from Example";
			ResultSet rs= stmt.executeQuery(sql);
			while(rs.next()) {
				String STName=rs.getString("StName");
				String Email= rs.getString("Email");
				exModel =new ExModel();
				exModel.setEmail(Email);
				exModel.setStName(StName);
				list.add(exModel);}
			stmt.close();

		}catch(Exception e) {
			e.printStackTrace();
		}return list;










	}



}
