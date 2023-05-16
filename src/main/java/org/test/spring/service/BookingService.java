package org.test.spring.service;

import java.util.List;

import org.test.spring.Model.Booking;

public interface BookingService {

	Booking savebooking(Booking booking);

	List<Booking> getAllbooking();

	Booking getbookingById(long id);
	
	void  deletebooking(long id);
}
