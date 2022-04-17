<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="StyleSheet" href="css/pageStyle.css">
<title>Sign-up Page</title>
</head>
<body>
	<form action="signupSuccess" method="post">
	  	<div class="container">
		    <h1>Sign-up Flight Reservation Application</h1>
		    <p>Please fill in this form to create an account.</p>
		   
		    <hr>
		    <label><b>First Name</b></label>
		    <input type="text" placeholder="Enter First Name" name="firstName">
		
		    <label><b>Last Name</b></label>
		    <input type="text" placeholder="Enter Last Name" name="lastName">
		    
		    <label><b>Email</b></label>
		    <input type="text" placeholder="Enter Email" name="email">
		
		    <label><b>Password</b></label>
		    <input type="text" placeholder="Enter Password" name="password">

		    <hr>
		    <button type="submit" class="btn">Sign-up</button>
	  	</div>
	  	<hr>
	  	<p>${msg}</p>
	</form>
</body>
</html>