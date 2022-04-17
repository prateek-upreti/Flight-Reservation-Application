<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="StyleSheet" href="css/pageStyle.css">
<title>Login Page</title>
</head>
<body>
	<form action="verified" method="post">
	  	<div class="container">
		    <h1>Sign-In Flight Reservation Application</h1>
		    <p>Please enter your email and password.</p>
		   
		    <hr>
		    <label><b>Email</b></label>
		    <input type="text" placeholder="Enter Email" name="email">
		
		    <label><b>Password</b></label>
		    <input type="text" placeholder="Enter Password" name="password">

		    <hr>
		    <button type="submit" class="btn">Login</button>
	  	</div>
	  	<hr>
	  	<p>${msg}</p>
	</form>
</body>
</html>