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
import org.test.spring.Model.Flight;
import org.test.spring.service.FlightService;


@RestController
@RequestMapping("/api/flights")
public class FlightController {

	@Autowired
	private FlightService flightservice;

	public FlightController(FlightService flightservice) {
		super();
		this.flightservice = flightservice;
	}

	@PostMapping() // Adding -- Create method...
	public ResponseEntity<Flight> saveEmployee(@RequestBody Flight flight) {
		return new ResponseEntity<Flight>(flightservice.saveflight(flight), HttpStatus.CREATED);
	}

	//Get all the detail of flight
	@GetMapping()
	public List<Flight> getAllflight() {
		return flightservice.getAllflight();
	}

	//get da
	@GetMapping("{id}")
	public ResponseEntity<Flight> getFlightById(@PathVariable("id") Long Id) {
		return new ResponseEntity<Flight>(flightservice.getFlightById(Id), HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public void deleteFlight(@PathVariable("id") Long id) {
		flightservice.deleteFlight(id);
	}
}
