package org.test.spring.service;

import java.util.List;

import org.test.spring.Model.Flight;


public interface FlightService {

	//Insert the Record
	Flight saveflight(Flight flight);
	
	//Read the flight Details
	List<Flight> getAllflight();

	//Read single Flight Details using Id
	Flight getFlightById(long id);
	
	//Delete FLight using Id
	void  deleteFlight(long id);
}
