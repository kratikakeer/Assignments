package com.te.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kratika");
		EntityManager createEntityManager = emf.createEntityManager();
//		String query = "from TeamIndia";
//		Query createQuery = createEntityManager.createQuery(query);
//		List<Team> resultList = createQuery.getResultList();
//		for (Team team : resultList) {
//			System.out.println(team);
		
//		String query = "from TeamIndia where id=7";
//		Query createQuery = createEntityManager.createQuery(query);
//		Object singleResult = createQuery.getSingleResult();
//		System.out.println(singleResult);
		
//		String query = "from TeamIndia where designation='Batsman'";
//		Query createQuery = createEntityManager.createQuery(query);
//		List<Team> resultList = createQuery.getResultList();
//		for (Team team : resultList) {
//			System.out.println(team);	
//		}
		
		String query1 = "Select min(salary) from TeamIndia";
		Query createQuery2 = createEntityManager.createQuery(query1);
		Double singleResult = (Double)createQuery2.getSingleResult();
		System.out.println(singleResult);
		
		EntityTransaction transaction = createEntityManager.getTransaction();
		String query2 = "update TeamIndia set salary=500000 where id=3";
		transaction.begin();
		Query createQuery = createEntityManager.createQuery(query2);
		int executeUpdate = createQuery.executeUpdate();
		transaction.commit();
		
		String query3 = "delete from TeamIndia where name='Ashwin'";
		transaction.begin();
		Query createQuery3 = createEntityManager.createQuery(query3);
		int executeUpdate2 = createQuery3.executeUpdate();
		transaction.commit();
		
		String query4 = "update TeamIndia set salary=:sal where id=:od";
		transaction.begin();
		Query createQuery4 = createEntityManager.createQuery(query4);
		createQuery4.setParameter("sal",320000.0);
		createQuery4.setParameter("od",1);
		int executeUpdate3 = createQuery4.executeUpdate();
		transaction.commit();
		
		
	}

}
