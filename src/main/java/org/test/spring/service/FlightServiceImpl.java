package org.test.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.test.spring.Model.Flight;
import org.test.spring.dao.FlightDao;
import org.test.spring.exception.ResourceNotFoundException;

@Service
public class FlightServiceImpl implements FlightService {

	private FlightDao flightdao;

	public FlightServiceImpl(FlightDao flightdao) {
		super();
		this.flightdao = flightdao;
	}

	public Flight saveflight(Flight flight) {

		return flightdao.save(flight);
	}

	@Override
	public List<Flight> getAllflight() {

		return (List<Flight>) flightdao.findAll();
	}

	@Override
	public Flight getFlightById(long id) {
		return flightdao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Exception", "id", id));
	}

	@Override
	public void deleteFlight(long id) {
		flightdao.deleteById(id);

	}

}
