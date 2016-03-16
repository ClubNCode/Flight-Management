package com.raj.flight.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Flight 
{
	@Id
	@Column
	String flightID;
	
	@Column
	String flightName;
	
	@Column
	String source;
	
	@Column
	String destination;
	
	@Column
	int economySeats;
	
	@Column
	int businessSeats;
	
	@Column
	int firstClassSeats;
	
	@Column
	String flightType;

	
	
	public String getFlightID() {
		return flightID;
	}

	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getEconomySeats() {
		return economySeats;
	}

	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}

	public int getBusinessSeats() {
		return businessSeats;
	}

	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}

	public int getFirstClassSeats() {
		return firstClassSeats;
	}

	public void setFirstClassSeats(int firstClassSeats) {
		this.firstClassSeats = firstClassSeats;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	
	
	
}
