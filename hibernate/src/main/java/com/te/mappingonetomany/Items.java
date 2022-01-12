package com.te.mappingonetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Items {
	@Id
	private String itemNames;
	private String itemBrand;
	private double itemPrice;
	@ManyToOne()
	private Cart cart;
	

	public String getItemNames() {
		return itemNames;
	}
	public void setItemNames(String itemNames) {
		this.itemNames = itemNames;
	}
	
	public String getItemBrand() {
		return itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}
	
	
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "Items [itemNames=" + itemNames + ", itemBrand=" + itemBrand + ", itemPrice=" + itemPrice + ", cart="
				+ cart + "]";
	}
	
	
}

	
	
	
	


