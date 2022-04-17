package com.flight_reservation.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.flight_reservation.DTOs.ReservationRequest;
import com.flight_reservation.Entities.Reservation;
import com.flight_reservation.Services.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/confirmationPage")
	public String confirmationPage(ReservationRequest request, ModelMap modelMap) {
		
		Reservation bookFlight = reservationService.bookFlight(request);
		
		modelMap.addAttribute("bookFlight",bookFlight);
		
		return "confirmationPage";
	}
}
