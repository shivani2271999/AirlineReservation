package com.airline.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.airline.model.User;

public class AirlineDaoImpl implements AirlineDao{
	
	EntityManagerFactory emf=null;
	EntityManager em=null;
	EntityTransaction t=null;
	
	public AirlineDaoImpl() {
		 emf=Persistence.createEntityManagerFactory("pu");
          em=emf.createEntityManager();
          t= em.getTransaction();
	}
	

	@Override
	public void addorUpdateUser(User u) {
		t.begin();
		User u1=em.merge(u);
		t.commit();
		
	}

}
