package com.harsh.Registration.Service;

import java.util.List;

import com.harsh.Registration.DOA.UserDoa;
import com.harsh.Registration.model.User;

public class UserService {
     private final UserDoa userDoa = new UserDoa();
     public User saveUser(User user) {
    	 return userDoa.saveUser(user); }
     public List<User> getUser(){
    	 return userDoa.getUser(); }
     public User getUser(String name) {
    	 return userDoa.getUser(name);
     }
     
}
