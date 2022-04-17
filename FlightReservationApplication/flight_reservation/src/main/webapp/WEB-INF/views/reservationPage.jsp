<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="StyleSheet" href="css/tableStyle.css">
<link rel="StyleSheet" href="css/pageStyle.css">
<title>Reservation Page</title>
</head>
<body>
	<h1>Selected Flight Details</h1>
	<table id="customers">
  		<tr>
		    <th>ID</th>
		    <th>Flight Number</th>
		    <th>Operating Airlines</th>
		    <th>Departure City</th>
		    <th>Arrival City</th>
		    <th>Date of Departure</th>
		    <th>Estimated Departure Time</th>
  		</tr>
  		<tr>
    		<td>${flight.id}</td>
    		<td>${flight.flightNumber}</td>
    		<td>${flight.operatingAirlines}</td>
    		<td>${flight.departureCity}</td>
    		<td>${flight.arrivalCity}</td>
    		<td>${flight.dateOfDeparture}</td>
    		<td>${flight.estimatedDepartureTime}</td>
  		</tr>
	</table>
		<form action="confirmationPage" method="post">
	  	<div class="container">
		    <h1>Passenger Details</h1>
		    <p>Please enter your details.</p>
		  
		    <label><b>First Name</b></label>
		    <input type="text" placeholder="Enter First Name" name="firstName">
		    
		    <label><b>Middle Name</b></label>
		    <input type="text" placeholder="Enter Middle Name" name="middleName">
		
		    <label><b>Last Name</b></label>
		    <input type="text" placeholder="Enter Last Name" name="lastName">
		    
		    <label><b>Email</b></label>
		    <input type="text" placeholder="Enter Email" name="email">
		
		    <label><b>Phone</b></label>
		    <input type="text" placeholder="Enter Phone Number " name="phone">
		    
		     <label><b>Card Number</b></label>
		    <input type="text" placeholder="Enter Card Number" name="cardNumber">
		    
		    <label><b>Name On The Card</b></label>
		    <input type="text" placeholder="Enter Name On The Card" name="nameOnTheCard">
		    
		    <label><b>CVV</b></label>
		    <input type="text" placeholder="Enter CVV" name="cvv">
		
		    <input type="hidden" name="id" value="${flight.id}">
		    
		    <label><b>Expire Date</b></label>
		    <input type="text" placeholder="Enter Expire Date " name="expireDate">

		    <button type="submit" class="btn">Reservation Now</button>
	  	</div>
	</form>
</body>
</html>