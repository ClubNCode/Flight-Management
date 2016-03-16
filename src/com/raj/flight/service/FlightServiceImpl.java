package com.rohit.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.flight.bean.Flight;
import com.wipro.flight.dao.FlightDAO;

@Service
@Transactional
public class FlightServiceImpl implements FlightService
{
	@Autowired
	FlightDAO flightdao;
	
	
	public String createFlight(Flight flight)
	{
		if(flight==null)
		{
			return "FAIL";
		}
		
		String flightid=flightdao.getComputedId(flight.getFlightName(), "FlightID_Seq");
		
		if(flightid.equalsIgnoreCase("FAIL") || flightid.equalsIgnoreCase("INVALID_INPUT"))
		{
			return "INVALID_INPUT";
		}
		
		flight.setFlightID(flightid);
		
		String add=flightdao.addFlight(flight);
		
		if(add.equals("SUCCESS"))
		{
			return "SUCCESS";
		}
		else
		{
			return "FAIL";
		}
		
		
	}
	
	public List<Flight> getAllFlights()
	{
		List l=flightdao.viewFlights();
		
		if(l.isEmpty())
		{
			return null;
		}
		
		return l;
	}
}
