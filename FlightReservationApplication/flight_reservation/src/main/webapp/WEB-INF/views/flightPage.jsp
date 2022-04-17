<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="StyleSheet" href="css/tableStyle.css">
<title>Flights Page</title>
</head>
<body>
	<h1>A Flights Schedule Table</h1>
	<table id="customers">
  		<tr>
		    <th>ID</th>
		    <th>Flight Number</th>
		    <th>Operating Airlines</th>
		    <th>Departure City</th>
		    <th>Arrival City</th>
		    <th>Date of Departure</th>
		    <th>Estimated Departure Time</th>
		    <th>Select</th>		    
  		</tr>
  		<c:forEach items="${flight }" var="flight">
  		<tr>
    		<td>${flight.id}</td>
    		<td>${flight.flightNumber}</td>
    		<td>${flight.operatingAirlines}</td>
    		<td>${flight.departureCity}</td>
    		<td>${flight.arrivalCity}</td>
    		<td>${flight.dateOfDeparture}</td>
    		<td>${flight.estimatedDepartureTime}</td>
    		<td><a href="reservationPage?id=${flight.id}">Select</a></td>
  		</tr>
  		</c:forEach>
	</table>
</body>
</html>