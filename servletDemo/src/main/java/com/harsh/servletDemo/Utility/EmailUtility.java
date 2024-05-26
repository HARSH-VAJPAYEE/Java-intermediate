package com.harsh.servletDemo.Utility;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtility {
	
	private static final String senderEmail = "2019006296.harsh@ug.sharda.ac.in";//change with your sender email
	private static final String senderPassword = "btechcomputerscience";//change with your sender password

	private void prepareEmailMessage(MimeMessage message, List<String> to, List<String> cc, List<String> bcc, String title, String html)
			throws MessagingException {
		message.setContent(html, "text/html; charset=utf-8");
		message.setFrom(new InternetAddress(senderEmail));
		if(to != null && to.size() > 0) {
			String email = getEmailsInString(to);
			System.out.println(email);
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
		}
		if(bcc != null && bcc.size() > 0) {

			String email = getEmailsInString(bcc);
			System.out.println(email);
			message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(email));
		}
		if(cc != null && cc.size() > 0) {
			String email = getEmailsInString(cc);
			System.out.println(email);
			message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(email));
		}
		
		
		message.setSubject(title);
	}
	
	public String getEmailsInString(List<String> emails) {
		StringBuilder builder = new StringBuilder();
		for (String string : emails) {
			builder.append(string+", ");
		}
		
		return builder.toString().substring(0, builder.toString().length() - 2);
	}
	
	private Session createSession() {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");//Outgoing server requires authentication
		props.put("mail.smtp.starttls.enable", "true");//TLS must be activated
		props.put("mail.smtp.host", "smtp.gmail.com"); //Outgoing server (SMTP) - change it to your SMTP server
		props.put("mail.smtp.port", "587");//Outgoing port

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(senderEmail, senderPassword);
			}
		});
		return session;
	}
	
	public void sendAsHtml(List<String> to, List<String> bcc, List<String> cc, String title, String html) throws MessagingException {
		System.out.println("Sending email to " + to);

		Session session = createSession();

		//create message using session
		MimeMessage message = new MimeMessage(session);
		prepareEmailMessage(message, to, bcc, cc, title, html);

		//sending message
		Transport.send(message);
		System.out.println("Done");
	}
}
