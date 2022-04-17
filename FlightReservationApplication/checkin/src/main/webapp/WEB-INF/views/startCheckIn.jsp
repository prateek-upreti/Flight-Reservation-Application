<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="StyleSheet" href="css/pageStyle.css">
<title>Check-in Page</title>
</head>
<body>
	<form action="proccedCheckIn" method="post">
	  	<div class="container">
		    <h1>Start Check-In Flight Reservation Application</h1>
		    <p>Please enter your Reservation ID below.</p>
		   
		    <hr>
		    <label><b>Enter Your Reservation ID</b></label>
		    <input type="text" placeholder="Enter Reservation ID" name="id">

		    <hr>
		    <button type="submit" class="btn">Start</button>
	  	</div>
	</form>
</body>
</html>