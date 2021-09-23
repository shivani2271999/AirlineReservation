package com.airline.test;

import java.time.LocalDate;

import org.junit.Test;

import com.airline.dao.AirlineDao;
import com.airline.dao.AirlineDaoImpl;
import com.airline.model.User;

public class AirlineTest {
	AirlineDao dao=new AirlineDaoImpl();
	
     @Test
     public void addorUpdateUser() {
    	 User u=new User();
    	 u.setFirstName("Shivani");
    	 u.setLastName("Seenivasan");
    	 u.setDob(LocalDate.of(1999,07,22));
    	 u.setGender("Female");
    	 dao.addorUpdateUser(u);
     }
}
