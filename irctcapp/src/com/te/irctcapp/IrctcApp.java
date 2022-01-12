package com.te.irctcapp;

public class IrctcApp {
	public static void main(String[] args) {
		TicketBook ticketBook = new TicketBook();

		Passenger vamsi = new Passenger(ticketBook, 10, "Vamsi");
		Passenger bhushan = new Passenger(ticketBook, 25, "Bhushan");
		Passenger siddhu = new Passenger(ticketBook, 18, "Siddhu");

		vamsi.start();
		bhushan.start();
		siddhu.start();

	}

}
