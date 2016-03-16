package com.rohit.flight.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.flight.bean.Flight;

@Repository
@Transactional
public class FlightDAOImpl implements FlightDAO
{
	@Autowired
	SessionFactory sessionFactory;
	

	@Override
	public String getComputedId(String name, String seqName) 
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		if(name==null || name.equals(""))
		{
			return "FAIL";
		}
		if(seqName==null || seqName.equals(""))
		{
			return "FAIL";
		}
		
		if(name.length()<2)
		{
			return "INVALID_INPUT";
		}
		int i;
		String nam=name.toUpperCase();
		for(i=0;i<nam.length();i++)
		{
			if((int)nam.charAt(i)<65 || (int)nam.charAt(i)>90)
			{
				return "INVALID_INPUT";
			}
		}
		
		if(!seqName.equalsIgnoreCase("FlightID_Seq"))
		{
			return "INVALID_INPUT";
		}
		String n=name.substring(0, 2).toUpperCase();
		
		System.out.println(n);
				
		SQLQuery q=session.createSQLQuery("select "+seqName+".nextval from dual");
		
		List l=q.list();
		BigDecimal b=(BigDecimal)l.get(0);
		int seq=b.intValue();
		
		//session.close();
		
		
		
		String flightid=n+seq;
		
		
		
		
		
		
		
		return flightid;
	}

	@Override
	public String addFlight(Flight flight) 
	{
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try
		{
			session.save(flight);
			
			tx.commit();
			//session.close();
			
			return "SUCCESS";
		}
		catch(Exception e)
		{
			return "ERROR";
		}
		
	}

	@Override
	public List<Flight> viewFlights() 
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Query q=session.createQuery("from Flight");
		
		tx.commit();
		//session.close();
		
		List l=q.list();
		
		if(l.isEmpty())
		{
			return null;
		}
		
		return l;
	}
	
}
