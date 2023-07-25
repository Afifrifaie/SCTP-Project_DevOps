package com.sctp.harbourbookingapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.sctp.harbourbookingapi.entity.Booking;

// Joel

public interface BookingRepository extends JpaRepository<Booking, Long>{


}
