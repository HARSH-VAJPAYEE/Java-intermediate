package com.harsh.servletDemo.Service;

import java.util.List;

import com.harsh.servletDemo.doa.UserDoa;
import com.harsh.servletDemo.model.User;

public class UserService implements IUserService{

	private final UserDoa userDoa;
	
	public UserService() {
		userDoa = new UserDoa();
	}
	
	public User saveUser(User user) {
		
		return userDoa.SaveUser(user);
	}

	public List<User> getUser() {
		return userDoa.getUser();
	}

	public User getUser(String email) {
		return userDoa.getUser(email);
	}

	}


