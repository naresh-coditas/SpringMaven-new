package com.coditas.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coditas.bean.UserDetails;
import com.coditas.dao.UserDaoService;

@Component
public class UserBO {

	@Autowired
	private UserDaoService userDaoService;

	public void setUserDaoService(UserDaoService userDaoService) {
		this.userDaoService = userDaoService;
	}
	
	public Boolean isValid(String userName, String password)
	{
		return userDaoService.isValid(userName, password);
	}
	
	public UserDetails findUserByName(String userName)
	{
		return userDaoService.findUserByName(userName);
	}
	
}
