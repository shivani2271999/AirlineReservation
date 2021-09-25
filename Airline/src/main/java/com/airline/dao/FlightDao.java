package com.airline.dao;

import java.time.LocalDate;
import java.util.List;

import com.airline.model.Flight;

public interface FlightDao {
	Flight addFlight(Flight flight);
	List<Flight>viewAllFlights();
	List<Flight>searchFlights(String source,String destination,LocalDate dep_date);
	Flight getFlightByFlightId(int flightId);
}
