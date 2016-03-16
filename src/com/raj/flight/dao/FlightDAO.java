package com.rohit.flight.dao;

import java.util.List;

import com.wipro.flight.bean.Flight;

public interface FlightDAO 
{
	String getComputedId(String name,String seqName);
	
	String addFlight(Flight flight);
	
	List<Flight> viewFlights();
}
