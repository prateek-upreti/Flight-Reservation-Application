package com.flight_reservation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flight_reservation.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
