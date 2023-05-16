package org.test.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.spring.Model.Booking;

import org.test.spring.service.BookingService;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

	@Autowired
	private BookingService bookingservice;

	public BookingController(BookingService bookingservice) {
		super();
		this.bookingservice = bookingservice;
	}
	
	@PostMapping() // Adding -- Create method...
	public ResponseEntity<Booking> savebooking(@RequestBody Booking booking) {
		return new ResponseEntity<Booking>(bookingservice.savebooking(booking), HttpStatus.CREATED);
	}

	@GetMapping()
	public List<Booking> getAllbooking() {
		return bookingservice.getAllbooking();
	}

	@GetMapping("{id}")
	public ResponseEntity<Booking> getbookingById(@PathVariable("id") Long Id) {
		return new ResponseEntity<Booking>(bookingservice.getbookingById(Id), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public void deletebooking(@PathVariable("id") Long id) {
		bookingservice.deletebooking(id);
	}
}
