package com.flight_reservation.Controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.flight_reservation.DTOs.ReservationPostmanRequest;
import com.flight_reservation.Entities.Reservation;
import com.flight_reservation.Repositories.ReservationRepository;

@RestController
public class ReservationRestController {
	@Autowired
	private ReservationRepository reservationRepo;
	
	@RequestMapping("/reservation/{id}")
	public Reservation postManGet(@PathVariable("id") Long id) {
		
		Optional<Reservation> findById = reservationRepo.findById(id);
		
		Reservation reservation = findById.get();
		return reservation;
	}
	
	@RequestMapping("/reservation")
	public Reservation postManPost(@RequestBody ReservationPostmanRequest request ) {
		
		Optional<Reservation> findById = reservationRepo.findById(request.getId());
		
		Reservation reservation = findById.get();
		
		reservation.setCheckedIn(request.isCheckedIn());
		
		reservation.setNumberOfBags(request.getNumberOfBags());
		
		Reservation save = reservationRepo.save(reservation);
		return save;
	}
}
