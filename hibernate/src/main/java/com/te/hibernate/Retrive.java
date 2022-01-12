package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class Retrive {
	public static void main(String[] args) {
		System.out.println("HelloWorld");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kratika");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		//Team vk = em.find(Team.class, 18);
		//System.out.println(vk);
		
		//Deleting the data
		Team vk = em.find(Team.class, 18);
		transaction.begin();
		em.remove(vk);
		transaction.commit();
		
		//updating the data
		Team kl = em.find(Team.class,1);
		if(kl!=null) {
			kl.setDesignation("Vc");
			transaction.begin();
			transaction.commit();
			System.out.println("Updated");
		}
	}

}
