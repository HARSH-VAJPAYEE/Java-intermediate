package com.harsh.servletDemo.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.harsh.servletDemo.Service.IUserService;
import com.harsh.servletDemo.Service.UserService;
import com.harsh.servletDemo.Utility.EmailUtility;
import com.harsh.servletDemo.model.User;
import com.harsh.servletDemo.model.UserHelper;

public class FirstController extends HttpServlet {
	
	private final UserHelper m_userHelper;
	private final EmailUtility emailUtility;
	private final IUserService userService;
	
	public FirstController() {
		m_userHelper = new UserHelper();
		userService = new UserService();
		emailUtility = new EmailUtility();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			emailUtility.sendAsHtml(Arrays.asList("gupta.pradeepkumar07@gmail.com", "vajpayeeharsh2001@gmail.com"), 
					Arrays.asList("hvajpayee082002@gmail.com", "hvajpayee2002@gmail.com"), 
					Arrays.asList("rv0831@gmail.com", "hvajpayee082002@gmail.com"),
					"Test email",
					"<h2>Java Mail Example</h2><p>hi there!</p>");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<User> users = userService.getUser();
		for (User user : users) {
			System.out.println("USER D" +user);
		}
		System.out.println("DO GET CALLED");
		req.setAttribute("userListself", users);
		req.getRequestDispatcher("home.jsp").include(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * System.out.println("DO POST CALLED"); Gson g = new Gson(); User user =
		 * g.fromJson(m_userHelper.getStringFromHttpServletRequest(req), User.class);
		 * System.out.println("USER OBJECT "+user);
		 */

		String emailId = req.getParameter("email");
		String fiName = req.getParameter("firstName");
		String lsName = req.getParameter("lastName");

		System.out.println("emailId "+emailId);
		System.out.println("fiName "+fiName);
		System.out.println("lsName "+lsName);
		
		User user = new User();
		user.setEmail(emailId);
		user.setFname(fiName);
		user.setLname(lsName);
		
		System.out.println("USER "+user);
		userService.saveUser(user);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DELETE");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("PUT");
	}
	
	
}
