package org.test.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.test.spring.Model.Booking;
import org.test.spring.dao.BookingDao;
import org.test.spring.exception.ResourceNotFoundException;

@Service
public class BookingServiceImpl implements BookingService{

	
	private BookingDao bookingdao;
	
	public BookingServiceImpl(BookingDao bookingdao) {
		super();
		this.bookingdao = bookingdao;
	}

	@Override
	public Booking savebooking(Booking booking) {
		return bookingdao.save(booking);
	}

	@Override
	public List<Booking> getAllbooking() {
		return (List<Booking>) bookingdao.findAll();
	}

	@Override
	public Booking getbookingById(long id) {
		return bookingdao.findById(id).orElseThrow(()->
		new ResourceNotFoundException("Exception","id",id));
	}

	@Override
	public void deletebooking(long id) {
		bookingdao.deleteById(id);
		
	}

}
