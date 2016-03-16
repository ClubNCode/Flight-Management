package com.raj.flight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FlightController 
{
	
	
	@RequestMapping(value="/goToAddFlight")
	public ModelAndView function1()
	{
		return null;
		
	}
	
	@RequestMapping(value="/add")
	public ModelAndView function2()
	{
		return null;
		
	}
	
	@RequestMapping("/viewAll")
	public ModelAndView function3()
	{
		return null;
		
	}
}
