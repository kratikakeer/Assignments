package com.te.springmvc.daolayer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.te.springmvc.model.Register;

@Component
public class DaoLayer {
	public void put(Register reg) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("register");
			EntityManager em = emf.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(reg);
			transaction.commit();
		} catch (Exception e){
			e.printStackTrace();
			
		}

}
}