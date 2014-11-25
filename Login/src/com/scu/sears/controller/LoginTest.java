package com.scu.sears.controller;

import org.springframework.web.servlet.ModelAndView;



public class LoginTest {
	protected ModelAndView onSubmit(Object command){
		

		ModelAndView modelAndView =new ModelAndView("login");
			return modelAndView;


	}

}
