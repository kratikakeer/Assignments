package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Team player1 = new Team();
		player1.setId(7);
		player1.setName("MS Dhoni");
		player1.setSalary(1000000);
		player1.setDesignation("Captain");

		Team player2 = new Team();
		player2.setId(18);
		player2.setName("Kohli");
		player2.setSalary(70000);
		player2.setDesignation("Vice Captain");

		Team player3 = new Team();
		player3.setId(78);
		player3.setName("Bumrah");
		player3.setSalary(40000);
		player3.setDesignation("Bowler");

		Team player4 = new Team();
		player4.setId(89);
		player4.setName("Rohit");
		player4.setSalary(60000);
		player4.setDesignation("Batsman");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kratika");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(player1);
		em.persist(player2);
		em.persist(player3);
		em.persist(player4);
		transaction.commit();

	}
}
