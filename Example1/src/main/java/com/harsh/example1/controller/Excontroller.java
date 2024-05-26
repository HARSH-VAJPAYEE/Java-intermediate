package com.harsh.example1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.harsh.example1.Service.ExService;
import com.harsh.example1.model.ExHelp;
import com.harsh.example1.model.ExModel;

public class Excontroller extends HttpServlet {
	private final ExHelp h_exHelp = new ExHelp();
	private final ExService exservice = new ExService();
	
	
	
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		List<ExModel> ee=exservice.getList();
		for (ExModel exmodel:ee) {
			System.out.println("USER D" +exmodel);}
		
		
		
		
		System.out.println("HI FROM GET");
	}
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException , ServletException{

		String Email = req.getParameter("Email");
		String StName = req.getParameter("Name");


		System.out.println("Email "+ Email);
		System.out.println("Name "+StName);
		
		ExModel exmodel= new ExModel();
		exmodel.setEmail(Email);
		exmodel.setStName(StName);
		System.out.println(exmodel);
		exservice.save(exmodel);
		
		
	
    }
    protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException ,IOException{
    	System.out.println("hi from PUT ");
    	
    }
    protected void doDelete(HttpServletRequest req, HttpServletResponse res)throws IOException , ServletException{
    	System.out.println("HI FROM DELETE");
    }
}
