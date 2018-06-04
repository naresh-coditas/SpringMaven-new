package com.coditas.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.coditas.bean.LoginBean;
import com.coditas.bo.UserBO;



@Controller
public class UserController {

	@Autowired
	UserBO userBo;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("loginForm", new LoginBean());
		return "login";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("loginForm") LoginBean loginBean,
		      BindingResult result, ModelMap model) {
		String viewName = "login";
		if(userBo.isValid(loginBean.getUserName(), loginBean.getPassword()))
		{
			viewName = "home";
			model.put("userDetails", userBo.findUserByName(loginBean.getUserName()));
		}
		return viewName;

	}
	
}