package com.coditas.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.coditas.bean.ElectronicAddress;
import com.coditas.bean.UserAddress;
import com.coditas.bean.UserDetails;

@Component
public class UserDaoService {

	Map<String, UserDetails> userMap = null;

	public UserDaoService() {
		userMap = new HashMap<String, UserDetails>();
		UserAddress localAddress = new UserAddress();
		UserAddress permenentAddress = new UserAddress();
		localAddress.setCity("PUNE");
		localAddress.setCountry("INDIA");
		localAddress.setDetails("101,Wadgaon Sheri");

		permenentAddress.setCity("JALAGAON");
		permenentAddress.setCountry("INDIA");
		permenentAddress.setDetails("101,Ganel Colony");

		ElectronicAddress electronicAddress = new ElectronicAddress();
		electronicAddress.setEmailId("nareshmahah87@gmail.com");
		electronicAddress.setFaceBookId("Naresh@facebook.com");
		userMap.put("NARESH",
				createUser("Naresh", "Mahajan", "naresh", localAddress, permenentAddress, electronicAddress));

	}

	private UserDetails createUser(String firstName, String lastName, String password, UserAddress localAddress,
			UserAddress permenentAddress, ElectronicAddress electronicAddress) {
		//
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName(firstName);
		userDetails.setLastName(lastName);
		userDetails.setPassword(password);
		userDetails.setElectronicAddress(electronicAddress);
		userDetails.setLocalAddress(localAddress);
		userDetails.setPermanantAddress(permenentAddress);
		return userDetails;
	}

	public UserDetails findUserByName(String userName) {
		// TODO Auto-generated method stub
		return userMap.get(userName);
	}

	public Boolean isValid(String userName, String password) {
		System.out.println("NARESH");
		try
		{
			UserDetails user = findUserByName(userName);
			if(user != null)
			{
				return user.getPassword().equals(password);
			}
		}
		catch(NullPointerException e)
		{
			
		}
		return false;
	}

}
