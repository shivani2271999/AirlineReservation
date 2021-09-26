package com.airline.test;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

import com.airline.dao.AirlineDao;
import com.airline.dao.AirlineDaoImpl;
import com.airline.model.Admin;
import com.airline.model.User;

public class AirlineTest {
	AirlineDao dao = new AirlineDaoImpl();

	@Test
	public void addorUpdateUser() {
		User u = new User();
		u.setFirstName("Shivani");
		u.setLastName("Sreenivasan");
		u.setDob(LocalDate.of(1999, 7, 22));
		u.setGender("Female");
		u.setEmail("shivani@gmail.com");
		u.setPassword("shivani8547");
		dao.addorUpdateUser(u);
	}

	@Test
	public void Login() {
		boolean str = dao.Login("nanikki2000@gmail.com", "nikki84567");
		System.out.println(str);
	}

	@Test
	public void getUserByemail() {
		User u = dao.getUserByemail("nanikki2000@gmail.com");
		System.out.println(u.getFirstName() + " " + u.getUserId());
	}

	@Test
	public void resetPassword() {
//		User u = new User();
//		System.out.println(u.getEmail()+" "+u.getPassword());
		int u1	= dao.resetPassword("nikki16", "nanikki2000@gmail.com");
		//System.out.println(u1.getEmail()+" "+u1.getPassword());
	}

	@Test
	public void addorUpdateAdmin() {
		Admin a = new Admin();
		a.setEmail("John@lti.com");
		a.setPassword("johnjoe@135");
		dao.addorUpdateAdmin(a);
	}

	@Test
	public void adminLogin() {
		boolean str = dao.adminLogin("nanikki2000@gmail.com", "nikki84567");
		System.out.println(str);
	}

	@Test
	public void getUserEmailByPassword() {
		String st = dao.getUserEmailByPassword("nikki1976");
		System.out.println(st);
	}
}
