package com.checkin.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.checkin.DTOs.Reservation;
import com.checkin.IntegrationDTOs.ReservationUpdateRequest;
import com.checkin.Integrations.ReservationRestfulClient;

@Controller
public class ReservationController {
	@Autowired
	private ReservationRestfulClient restClient;
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn() {
		return "startCheckIn";
	}
	
	@RequestMapping("/proccedCheckIn")
	public String proccedCheckIn(@RequestParam("id") Long id, ModelMap modelMap) {
		
		Reservation reservation = restClient.findReservation(id);
		modelMap.addAttribute("reservation",reservation);
	
		return "proccedCheckIn";
	}
	
	@RequestMapping("/proceedToCheckIn")
	public String updateReservation(@RequestParam("id") Long id, @RequestParam("numberOfBags") int numberOfBags, ModelMap modelMap) {
		
		ReservationUpdateRequest request = new ReservationUpdateRequest(); 
		
		request.setId(id);
		request.setNumberOfBags(numberOfBags);
		request.setCheckedIn(true);
		
		restClient.updateReservation(request);
		return "confirmationPage";
	}
}
