<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="StyleSheet" href="css/tableStyle.css">
<link rel="StyleSheet" href="css/pageStyle.css">
<title>Detail Page</title>
</head>
<body>
	<h1>Passenger Details</h1>
	<table id="customers">
  		<tr>
		    <th>Passenger Name</th>
		    <th>Email ID</th>
		    <th>Phone Number</th>
  		</tr>
  		<tr>
    		<td>${reservation.getPassenger().firstName} ${reservation.getPassenger().lastName}</td>
    		<td>${reservation.getPassenger().email}</td>
    		<td>${reservation.getPassenger().phone}</td>
  		</tr>
	</table>
	
	<hr>
	<h1>Flight Details</h1>
	<table id="customers">
  		<tr>
		    <th>Flight Number</th>
		    <th>Operating Airlines</th>
		    <th>Departure City</th>
		    <th>Arrival City</th>
		    <th>Date of Departure</th>
		    <th>Estimated Departure Time</th>
  		</tr>
  		<tr>
    		<td>${reservation.getFlight().flightNumber}</td>
    		<td>${reservation.getFlight().operatingAirlines}</td>
    		<td>${reservation.getFlight().departureCity}</td>
    		<td>${reservation.getFlight().arrivalCity}</td>
    		<td>${reservation.getFlight().dateOfDeparture}</td>
    		<td>${reservation.getFlight().estimatedDepartureTime}</td>
  		</tr>
	</table>
	<hr>
	<form action="proceedToCheckIn" method="post">
	  	<div class="container">
		    <h1>Update Number of Bags</h1>
		    <hr>
		    <label><b>Reservation ID</b></label>
		    <input type="text" placeholder="Enter Number of Bags" name="id" value="${reservation.getId()}" readonly>
		
		    <label><b>Number of Bags</b></label>
		    <input type="text" placeholder="Enter Status" name="numberOfBags">

		    <hr>
		    <button type="submit" class="btn">Confirm</button>
	  	</div>
	</form>


</body>
</html>