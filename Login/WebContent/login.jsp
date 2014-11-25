<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form  id ="loginController" commandName="login" method="POST" name="login">

Username:<input path="username" type="text"/>
			<font color="red"><errors path="username" /></font>
			<br />
			<br />
Password:<input path="password" type="password"/>
			<font color="red"><errors path="password" /></font>
			<br />
			<br />
			<input type="submit" value="Login" />
		</form>
</body>
</html>