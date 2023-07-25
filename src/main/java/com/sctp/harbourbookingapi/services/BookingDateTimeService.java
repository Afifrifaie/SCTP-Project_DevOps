package com.sctp.harbourbookingapi.services;

import java.util.List;

import com.sctp.harbourbookingapi.entity.Booking;

public interface BookingDateTimeService {
  public Booking createBookingWithDateTime(Booking booking);
  public void deleteBookingWithDateTime(Long id);
  public List<Booking> getAllBookingsWithDateTime();
  public Booking getBookingWithDateTime(Long id);
  public Booking updateBookingWithDateTime(Long id, Booking booking);

}

