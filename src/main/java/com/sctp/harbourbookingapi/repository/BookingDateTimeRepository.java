package com.sctp.harbourbookingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sctp.harbourbookingapi.entity.BookingDateTime;

public interface BookingDateTimeRepository extends JpaRepository<BookingDateTime, Long>{
  
}

