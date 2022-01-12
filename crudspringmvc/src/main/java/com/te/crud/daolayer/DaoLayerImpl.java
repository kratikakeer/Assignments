package com.te.crud.daolayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.crud.model.Employee;

@Repository
public class DaoLayerImpl implements DaoLayer {

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud");
		return factory.createEntityManager();
	}

	@Override
	public boolean save(Employee emp) {

		try {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
			EntityManager manager = getEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(emp);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean remove(int id) {
		try {
			EntityManager manager = getEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Employee find = manager.find(Employee.class, id);
			manager.remove(find);
			transaction.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean update(String name, String newname) {
		try {
			EntityManager manager = getEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query createQuery = manager.createQuery("select id from Employee where firstname=:n");
			createQuery.setParameter("n", name);
			Object singleResult = createQuery.getSingleResult();
			Query createQuery2 = manager.createQuery("update Employee set firstname=:s where id=:i");
			createQuery2.setParameter("s", newname);
			createQuery2.setParameter("i", singleResult);
			
			createQuery2.executeUpdate();
			transaction.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	
	@Override
	public boolean update1(int id, String firstname) {
		try {
			EntityManager manager = getEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Employee find = manager.find(Employee.class, id);
			find.setFirstname(firstname);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	@Override
	public Object getone(int id) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query createQuery = manager.createQuery("from Employee where id=:i");
		createQuery.setParameter("i", id);
		Object singleResult = createQuery.getSingleResult();
		transaction.commit();
		return singleResult;
	}

	@Override
	public List<Employee> get() {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query createQuery = manager.createQuery("from Employee");
		List resultList = createQuery.getResultList();
		transaction.commit();
		return resultList;
	}

}
