package com.scu.sears.controller;

import org.springframework.web.servlet.ModelAndView;

import com.scu.sears.bean.Login;
import com.scu.sears.dao.LoginDAO;

public class LoginController {

	protected ModelAndView onSubmit(Object command){
		Login login = (Login) command;
		LoginDAO loginDAO= new LoginDAO();
		String name=login.getUsername();

		ModelAndView modelAndView =null;
		boolean isLogin=loginDAO.validateLogin(login);
		System.out.println(isLogin);
		if(isLogin){
			
			new ModelAndView("success");
			modelAndView.addObject("name", name); 
		}
		else{
			new ModelAndView("login");
		}

		return modelAndView;


	}

}
