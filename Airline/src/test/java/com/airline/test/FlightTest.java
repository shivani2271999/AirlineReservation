package com.airline.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.junit.Test;

import com.airline.dao.FlightDao;
import com.airline.dao.FlightDaoImpl;
import com.airline.model.Flight;

public class FlightTest {
	FlightDao dao=new FlightDaoImpl();
	@Test
	public void AddFlightTest() {
		Flight flight=new Flight();
		flight.setPriceSeat(1000);
		flight.setCapacity(300);
		flight.setDestination("Salem");
		flight.setSource("Chennai");
		flight.setArrivalTime(LocalTime.of(05,35,55));
		flight.setDepartureTime(LocalTime.of(07,30,40));
		flight.setDepartureDate(LocalDate.of(2021, 10, 01));
		flight.setArrivalDate(LocalDate.of(2021, 10, 01));
		dao.addFlight(flight);
	}
	
	@Test
	public void viewAllFlights() {
		List<Flight>flights=dao.viewAllFlights();
		flights.stream().forEach(f->System.out.println(f.getFlightNo()+" "+f.getSource()+" "+f.getArrivalTime()+" "+f.getDepartureTime()));
	}
	@Test
	public void viewSelectFlights() {
		List<Flight>flights=dao.searchFlights("Chennai", "Coimbatore", LocalDate.of(2021, 10, 03));
		flights.stream().forEach(f->System.out.println(f.getFlightNo()+" "+f.getSource()+" "+f.getArrivalTime()));
	}
	@Test
	public void getFlightbyFlightId() {
		Flight flight=dao.getFlightByFlightId(5);
		System.out.println(flight.getSource()+" "+flight.getDestination()+" "+flight.getArrivalTime()+" "+flight.getDepartureTime());
	}
}
