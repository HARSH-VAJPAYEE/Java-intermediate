package com.javaCore.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.javaCore.model.Student;
import com.javaCore.utility.DatabaseUtility;

public class StudentDao implements IStudentDao {

	Connection con = null;
	
	@Override
	public Student saveStudent(Student student) {
		try {
		con = DatabaseUtility.getConnection();  
		Statement stmt =con.createStatement();  
		String sql = "INSERT INTO student1(student_id,student_name,city,state) " +
                "VALUES ("+student.getStudentId()+", '"+student.getStudentName()+"', '" +student.getCity()+"', '"+student.getState()+"')";
		stmt.executeUpdate(sql);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> getStudents() {
		List<Student> list = new ArrayList<Student>();
		try {
			con = DatabaseUtility.getConnection(); 
			Statement stmt =con.createStatement(); 
			String query = "select * from student1";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next())
		      {
		        int id = rs.getInt("student_id");
		        String studentName = rs.getString("student_name");
		        String city = rs.getString("city");
		        String pincode = rs.getString("pincode");
		        String state = rs.getString("state");
		        
		        Student student = new Student();
		        student.setStudentId(id);
		        student.setCity(city);
		        student.setState(state);
		        student.setStudentName(studentName);
		        list.add(student);
		      }
			stmt.close();

		} catch(SQLException sqle) {
			
		}
		return list;
	}

	@Override
	public Student getStudent(int id) {
		Student student = null;
		try {
			con = DatabaseUtility.getConnection(); 
			Statement stmt =con.createStatement(); 
			String query = "select * from student1 where student_id ="+id;
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next())
		      {
		        int stdId = rs.getInt("student_id");
		        String studentName = rs.getString("student_name");
		        String city = rs.getString("city");
		        String pincode = rs.getString("pincode");
		        String state = rs.getString("state");
		        
		        student = new Student();
		        student.setStudentId(id);
		        student.setCity(city);
		        student.setState(state);
		        student.setStudentName(studentName);
		        break;
		      }
			stmt.close();

		} catch(SQLException sqle) {
			
		}
		return student;
	}

}
