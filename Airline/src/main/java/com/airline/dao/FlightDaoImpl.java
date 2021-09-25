package com.airline.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.airline.model.Flight;

public class FlightDaoImpl implements FlightDao {

	EntityManagerFactory emf = null;
	EntityManager em;
	EntityTransaction et;

	public FlightDaoImpl() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		et = em.getTransaction();
	}

	@Override
	public Flight addFlight(Flight flight) {
		et.begin();
			Flight f=em.merge(flight);
		et.commit();
		return f;
	}


	
	@Override
	public List<Flight> searchFlights(String source, String destination,LocalDate dep_date) {
		String jpql="select f from Flight f where f.source=:sou and f.destination=:des and f.departureDate=:date";
		TypedQuery<Flight>flights=em.createQuery(jpql,Flight.class);
		flights.setParameter("sou", source);
		flights.setParameter("des", destination);
		flights.setParameter("date",dep_date);
		return flights.getResultList();
	}

	@Override
	public List<Flight> viewAllFlights() {
		String jpql="select f from Flight f";
		TypedQuery<Flight>flights=em.createQuery(jpql,Flight.class);
		return flights.getResultList();
	}

	@Override
	public Flight getFlightByFlightId(int flightId) {
		
		return em.find(Flight.class, flightId);
	}

}
