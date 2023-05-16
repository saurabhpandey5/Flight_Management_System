package org.test.spring.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flight")
public class Flight {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long flightNo;
	
	@Column(name="flightName", nullable=false)
	private String flightName;
	
	@Column(name="flightModel")
	private String flightModel;
	
	@Column(name="seatCapacity")
	private int seatCapacity;

	//Parameterized Constructors
	public Flight(long flightNo, String flightName, String flightModel, int seatCapacity) {
		super();
		this.flightNo = flightNo;
		this.flightName = flightName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;
	}

	//Default Constructors
	public Flight() {
		super();
		
	}

	//Getter and Setter Method
	public long getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(long flightNo) {
		this.flightNo = flightNo;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
	
	
	
}
