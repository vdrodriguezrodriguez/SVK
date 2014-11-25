package com.scu.sears.dao;

import com.scu.sears.bean.Login;

public class LoginDAO {
	boolean isLogin;

	public boolean validateLogin(Login login){
		String name=login.getUsername();
		String passwd= login.getPassword();
		if(name.equalsIgnoreCase("amrita") && passwd.equalsIgnoreCase("sears"))
		isLogin=true;
		return isLogin;
	}
}
