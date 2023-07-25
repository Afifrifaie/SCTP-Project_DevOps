package com.sctp.harbourbookingapi.services;

import java.util.ArrayList;
import com.sctp.harbourbookingapi.entity.Booking;


// Joel 


public interface BookingService {
    
    Booking saveBooking(Booking booking);

    Booking getBooking(Long id);

    ArrayList<Booking> getAllBookings();

    Booking updateBooking(Long id, Booking booking);

    void deleteBooking(Long id);
}
