<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="StyleSheet" href="css/pageStyle.css">
<title>Search Page</title>
</head>
<body>
	<form action="flightPage" method="post">
	  	<div class="container">
		    <h1>Search Flights Here</h1>
		    <p>Please enter details.</p>
		   
		    <hr>
		    <label><b>From</b></label>
		    <input type="text" placeholder="Enter From Country" name="from">
		
		    <label><b>To</b></label>
		    <input type="text" placeholder="Enter To Country" name="to">
		    
		    <label><b>Departure Date</b></label>
		    <input type="text" placeholder="Enter Departure Date" name="departureDate">

		    <hr>
		    <button type="submit" class="btn">Search Flights</button>
	  	</div>
	  	<hr>
	  	<p>${msg}</p>
	</form>
</body>
</html>