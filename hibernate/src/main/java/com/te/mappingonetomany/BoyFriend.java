package com.te.mappingonetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BoyFriend {
	@Id
	private int bid;
	
	private String name;
	
	private double balance;
	
	@ManyToOne
	private GirlFriend girl;
	
	
	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public GirlFriend getGirl() {
		return girl;
	}

	public void setGirl(GirlFriend girl) {
		this.girl = girl;
	}

	@Override
	public String toString() {
		return "Boy [id=" + bid + ", name=" + name + ", balance=" + balance + ", girl=" + girl + "]";
	}
	

}
