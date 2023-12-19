<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Verification</title>
</head>
<body>
	<h2>Login Here ....</h2>
	<form action="loginVerification" method="post">
	<table>
	<tr>
	<td>Username</td>
	<td><input type="text" name="email"/></td>
	</tr>
	
	<tr>
	<td>Password</td>
	<td><input type="password" name="password"/></td>
	</tr>
	
	<tr>
	<td><input type="submit" value="Login"/></td>
	</tr>
	
	</table>
	
	</form>
	<%
		if(request.getAttribute("connection")!= null){
			if(request.getAttribute("connection").equals("true")){
				out.println("Connection Established Successufully");
			}else{
				out.println("Connection Not Established ");
			}
		}
	%>
	<br>
	<%
		if(request.getAttribute("verify")!= null){
			if(request.getAttribute("verify").equals("true")){
				out.println("Login Verified");
			}else{
				out.println("Invalid username/password");
			}
		}
	%>
</body>
</html>