package com.checkin.Integrations;

import com.checkin.DTOs.Reservation;
import com.checkin.IntegrationDTOs.ReservationUpdateRequest;

public interface ReservationRestfulClient {

	Reservation findReservation(Long id);
	
	Reservation updateReservation( ReservationUpdateRequest request);
}
