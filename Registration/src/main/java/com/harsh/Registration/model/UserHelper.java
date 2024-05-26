package com.harsh.Registration.model;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

public class UserHelper {
	public String getStringFromHttpRequest(HttpServletRequest req) throws IOException{
		StringBuilder sb=new StringBuilder();
		BufferedReader br= req.getReader();
		try {
			String line;
			while((line=br.readLine())!= null) {
				sb.append(line).append('\n');}
		}finally {
			br.close();
		}
		return sb.toString();

	}
}
