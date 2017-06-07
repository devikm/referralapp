package com.cc.referralapp.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.referralapp.user.dao.UserLoginRepository;
import com.cc.referralapp.user.model.UserLogin;

@Service
public class UserService {

	@Autowired
	UserLoginRepository userLoginRepository;
	
	
	public boolean addUser(UserLogin userLogin)
	{
		userLoginRepository.save(userLogin);
		return true;
	}
	
	public List<UserLogin> getAllUsers(){
		
		List<UserLogin> userList = new ArrayList<UserLogin>();
		for (UserLogin userLogin : userLoginRepository.findAll()) {
			userList.add(userLogin);
		}
		
		return userList;
		
	}
}
