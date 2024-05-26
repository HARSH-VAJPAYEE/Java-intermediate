package com.harsh.servletDemo.Service;
import java.util.List;

import com.harsh.servletDemo.model.User;


public interface IUserService {
	public User saveUser(User user);
	public List<User> getUser();
	public User getUser(String email);
	

}
