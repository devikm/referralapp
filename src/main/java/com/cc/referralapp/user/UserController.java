package com.cc.referralapp.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cc.referralapp.user.model.UserLogin;
import com.cc.referralapp.user.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	boolean addUser(UserLogin userLogin)
	{
		return userService.addUser(userLogin);
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	List<UserLogin> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	
}
