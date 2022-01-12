package com.te.mappingonetomany;

import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Flipcart {
	public static void main(String[] args) {

		Cart cart = new Cart();
		cart.setCartId(101);
		
		Items item = new Items();
		item.setItemNames("EarPhone");
		item.setItemBrand("Boat");
		item.setItemPrice(399);

		Items item2 = new Items();
		item2.setItemNames("Mobile");
		item2.setItemBrand("RealMe");
		item2.setItemPrice(15000);

		Items item3 = new Items();
		item3.setItemNames("Watch");
		item3.setItemBrand("FastTrack");
		item3.setItemPrice(3499);

		Items item4 = new Items();
		item4.setItemNames("Jacket");
		item4.setItemBrand("Wrogn");
		item4.setItemPrice(1999);

		List<Items> listOfItems = Arrays.asList(item, item2, item3, item4);
		cart.setItems(listOfItems);
		item.setCart(cart);
		item2.setCart(cart);
		item3.setCart(cart);
		item4.setCart(cart);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(cart);
		em.persist(item);
		em.persist(item2);
		em.persist(item3);
		em.persist(item4);
		transaction.commit();

	}

}
