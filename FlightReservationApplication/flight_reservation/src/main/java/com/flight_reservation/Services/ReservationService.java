package com.flight_reservation.Services;

import com.flight_reservation.DTOs.ReservationRequest;
import com.flight_reservation.Entities.Reservation;

public interface ReservationService {

	Reservation bookFlight(ReservationRequest request);

}
