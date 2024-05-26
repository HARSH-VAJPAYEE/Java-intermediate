package com.harsh.servletDemo.controller;

import java.util.Arrays;

import javax.mail.MessagingException;

import com.harsh.servletDemo.Utility.EmailUtility;

public class Snippet {
	
	
	public static void main(String[] args) throws MessagingException {
		EmailUtility emailUtility = new EmailUtility();
		emailUtility.sendAsHtml(Arrays.asList("gupta.pradeepkumar07@gmail.com", "vajpayeeharsh2001@gmail.com"), 
				Arrays.asList("hvajpayee082002@gmail.com", "hvajpayee2002@gmail.com"), 
				Arrays.asList("rv0831@gmail.com", "hvajpayee082002@gmail.com"),
				"Test email",
				"<h2>Java Mail Example</h2><p>hi there!</p>");
	}
}

