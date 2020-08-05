package com.htwojpa.web.titanic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long>, CustomedPassengerRepository {
}
