package com.te.mappingonetomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass2 {
	public static void main(String[] args) {
		GirlFriend girl = new GirlFriend();
	    girl.setGid(420);
	    girl.setName("Sanjana");
	    
	    BoyFriend boy = new BoyFriend();
	    boy.setBid(101);
	    boy.setName("Sanjay");
	    boy.setBalance(100000);
	    
	    
	    BoyFriend boy2 = new BoyFriend();
	    boy2.setBid(102);
	    boy2.setName("Shashi");
	    boy2.setBalance(200000);
	    
	    BoyFriend boy3 = new BoyFriend();
	    boy3.setBid(103);
	    boy3.setName("Hemanth");
	    boy3.setBalance(300000);
	    
	    
	    List<BoyFriend> listOfBoys = Arrays.asList(boy,boy2,boy3);
	    girl.setBoys(listOfBoys);
	     
	    boy.setGirl(girl);
	    boy2.setGirl(girl);
	    boy3.setGirl(girl);
	    
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
	    EntityManager em = emf.createEntityManager();
	    EntityTransaction transaction = em.getTransaction();
	    transaction.begin();
	    em.persist(boy);
	    em.persist(boy2);
	    em.persist(boy3);
	    em.persist(girl);
	    transaction.commit();
	    
	}

}
