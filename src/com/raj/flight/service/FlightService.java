package com.raj.flight.service;

import java.util.List;

import com.wipro.flight.bean.Flight;

public interface FlightService 
{
	String createFlight(Flight flight);
	List<Flight> getAllFlights();
}
