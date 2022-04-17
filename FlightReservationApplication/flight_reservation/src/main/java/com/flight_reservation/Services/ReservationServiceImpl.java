package com.flight_reservation.Services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flight_reservation.DTOs.ReservationRequest;
import com.flight_reservation.Entities.Flight;
import com.flight_reservation.Entities.Passenger;
import com.flight_reservation.Entities.Reservation;
import com.flight_reservation.Repositories.FlightRepository;
import com.flight_reservation.Repositories.PassengerRepository;
import com.flight_reservation.Repositories.ReservationRepository;
import com.flight_reservation.Utilities.EmailSender;
import com.flight_reservation.Utilities.PDFgenerator;

@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private ReservationRepository reservationRepo;
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private PDFgenerator pdfGenerator;
	
	@Autowired
	private EmailSender emailSender;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setMiddleName(request.getMiddleName());
		passenger.setLastName(request.getLastName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		
		long id = request.getId();		
		Optional<Flight> findById = flightRepo.findById(id);
		Flight flight = findById.get();
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		
		String fliePath = "D:\\Notes\\PSA\\FlightTickets\\ticket_"+reservation.getId()+".pdf";
		
		reservationRepo.save(reservation);
		
		pdfGenerator.generatePDF(reservation, fliePath);
		emailSender.sendEmail(passenger.getEmail(), fliePath);
		return reservation;
	}
}


































