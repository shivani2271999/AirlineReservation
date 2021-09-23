package com.airline.model;


import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Flight {
	@Id
	@SequenceGenerator(name="fli_seqdemo",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="fli_seqdemo")
	int flightNo;
	String source;
	String destination;
	LocalDate dateOfJourney;
	Calendar dep = Calendar.getInstance();
	Calendar arr = Calendar.getInstance();
	
	
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


	public LocalDate getDateOfJourney() {
		return dateOfJourney;
	}


	public void setDateOfJourney(LocalDate dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}


	public Date getDep() {
		return dep.getTime();
	}


	public void setDep(Calendar dep) {
		
		
		this.dep = dep;
	}


	public Date getArr() {
		return arr.getTime();
	}


	public void setArr(Calendar arr) {
		this.arr = arr;
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
