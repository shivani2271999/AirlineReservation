package com.airline.dao;

import com.airline.model.Admin;
import com.airline.model.User;

public interface AirlineDao {
	User addorUpdateUser(User u);
	boolean adminLogin(String email, String password);
	Admin addorUpdateAdmin(Admin admin);
	int resetPassword(String password,String email);
	String getUserEmailByPassword(String password);
	boolean Login(String email,String password);
	User getUserByemail(String email);

}
