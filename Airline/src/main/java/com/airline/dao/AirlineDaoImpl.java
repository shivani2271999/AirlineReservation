package com.airline.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.airline.model.Admin;
import com.airline.model.User;

public class AirlineDaoImpl implements AirlineDao {

	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction t = null;

	public AirlineDaoImpl() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		t = em.getTransaction();
	}

	@Override
	public User addorUpdateUser(User u) {
		t.begin();
		User u1 = em.merge(u);
		t.commit();
		return u1;
	}

	@Override
	public boolean Login(String email, String password) {
		String jpql = "select count(u) from User u where u.email=:e and u.password=:pwd";
		Query q = em.createQuery(jpql);
		q.setParameter("e", email);
		q.setParameter("pwd", password);
		Long count = (Long)q.getSingleResult();
		return count>0?true:false;
		
	}

	
	@Override
	public User getUserByemail(String email) {
		String jpql = "select u from User u where u.email=:e";
		Query q = em.createQuery(jpql);
		q.setParameter("e", email);
		User u = (User) q.getSingleResult();
		return u;
	}

	
	@Override
	
	public int resetPassword(String password,String email) {
		t.begin();
		String jpql = "update User u set u.password=:psw where u.email=:em";
		Query q = em.createQuery(jpql);
		q.setParameter("psw", password);
		q.setParameter("em",email);
		int res = q.executeUpdate();
		t.commit();
		return res;
		
	}

	@Override
	public Admin addorUpdateAdmin(Admin admin) {
		t.begin();
		Admin ad = em.merge(admin);
		t.commit();
		return ad;
	}
	
	@Override
	public boolean adminLogin(String email, String password) {
		String jpql = "select count(a) from Admin a where a.email=:e and a.password=:pwd";
		Query q = em.createQuery(jpql);
		q.setParameter("e", email);
		q.setParameter("pwd", password);
		Long count = (Long)q.getSingleResult();
		return count>0?true:false;
	}

	@Override
	public String getUserEmailByPassword(String password) {
		String jpql = "select u.email from User u where u.password=:psw";
		Query q = em.createQuery(jpql);
		q.setParameter("psw", password);
		
		return (String) q.getSingleResult();
	}

}
