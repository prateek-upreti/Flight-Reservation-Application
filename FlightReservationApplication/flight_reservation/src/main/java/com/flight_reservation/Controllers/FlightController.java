package com.flight_reservation.Controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.flight_reservation.Entities.Flight;
import com.flight_reservation.Repositories.FlightRepository;

@Controller
public class FlightController {
	@Autowired
	private FlightRepository flightRepo;
	
	@RequestMapping("/searchPage")
	public String searchPage() {
		return "searchFlightPage";
	}
	
	@RequestMapping("/flightPage")
	public String flightPage(@RequestParam("from") String from, @RequestParam("to") String to, 
			@RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate, ModelMap modelMap) {
		
		List<Flight> flight = flightRepo.findByQuery(from, to, departureDate);
		
		modelMap.addAttribute("flight",flight);
		return "flightPage";
	}
	
	@RequestMapping("/allFlights")
	public String allFlights(ModelMap modelMap) {
		List<Flight> flight = flightRepo.findAll();
		modelMap.addAttribute("flight",flight);
		return "allFlights";
	}
	
	@RequestMapping("/reservationPage")
	public String reservationPage(@RequestParam("id") Long id, ModelMap modelMap) {
		
		Optional<Flight> findById = flightRepo.findById(id);
		Flight flight = findById.get();
		modelMap.addAttribute("flight",flight);
		return "reservationPage";
	}
}

























