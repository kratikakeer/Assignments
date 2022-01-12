package com.te.irctcapp;

public class Passenger extends Thread {
	TicketBook book;
	int noOfTickets;
	String name;
	
	public Passenger(TicketBook book, int noOfTickets, String name) {
		super();
		this.book = book;
		this.noOfTickets = noOfTickets;
		this.name = name;
	}
	
	@Override
	public void run() {
		book.bookTickets(noOfTickets);
		super.run();
	}
	
	

}
