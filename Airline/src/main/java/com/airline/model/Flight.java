package com.airline.model;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Flight")
public class Flight {
	@Id
	@SequenceGenerator(name="fli_seqdemo",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="fli_seqdemo")
	int flightNo;
	String source;
	String destination;
	LocalTime departureTime;
	LocalTime arrivalTime;
	LocalDate arrivalDate;
	LocalDate departureDate;
	int capacity;
	int priceSeat;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	
	public LocalTime getDepartureTime() {
		return departureTime;
	}



	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}



	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}



	public LocalDate getArrivalDate() {
		return arrivalDate;
	}



	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}



	public LocalDate getDepartureDate() {
		return departureDate;
	}



	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}



	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public int getPriceSeat() {
		return priceSeat;
	}


	public void setPriceSeat(int priceSeat) {
		this.priceSeat = priceSeat;
	}


	public int getFlightNo() {
		return flightNo;
	}


	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
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


	
//
//	void setTime(int h,int min,int sec,int mili){
//	dep.set(Calendar.HOUR_OF_DAY,h);
//	dep.set(Calendar.MINUTE,min);
//	dep.set(Calendar.SECOND,sec);
//	dep.set(Calendar.MILLISECOND,mili);
//	}
//	
	
	
	

	

}
