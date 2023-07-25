package com.sctp.harbourbookingapi.exception;

public class BookingWithDateTimeNotFoundException extends RuntimeException {
  public BookingWithDateTimeNotFoundException(Long id) {
    super("Booking with id " + id + " not found.");
  }
}
