package com.checkin.Integrations;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.checkin.DTOs.Reservation;
import com.checkin.IntegrationDTOs.ReservationUpdateRequest;

@Component
public class ReservationRestfulClientImpl implements ReservationRestfulClient {
	
	
	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemp = new RestTemplate();
		Reservation reservation = restTemp.getForObject("http://localhost:8080/flights/reservation/"+id, Reservation.class);
		
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemp = new RestTemplate();
		Reservation reservation = restTemp.postForObject("http://localhost:8080/flights/reservation/", request,Reservation.class );
		
		return reservation;
	}
}
