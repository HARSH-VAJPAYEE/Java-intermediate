package com.harsh.Registration.Controller;

import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.harsh.Registration.Service.UserService;
import com.harsh.Registration.model.User;
import com.harsh.Registration.model.UserHelper;

public class FirstController extends HttpServlet {
	
	private final UserHelper helper = new UserHelper();
	private final UserService service = new UserService();
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		List<User> list1= service.getUser();
		for(User user: list1) {
			System.out.println(list1);
		}
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Name= req.getParameter("Name");
		String PhoneNumber=req.getParameter("PhoneNumber");
		String Email=req.getParameter("Email");
		System.out.println("Email:"+ Email);
		System.out.println("PhoneNumber:"+ PhoneNumber);
		System.out.println("Email:"+ Email);
		
		User user= new User();
		user.setName(Name);
		user.setEmail(Email);
        user.setPhoneNumber(PhoneNumber);
		
		System.out.println(user);
		service.saveUser(user);
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
