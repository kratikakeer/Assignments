package com.te.irctcapp;

public class TicketBook {
	int tickets=20;
	String name;
	
	public synchronized void bookTickets(int noOfTicket) {
		
		System.out.println("Login Succesfull");
		System.out.println("Welcome to IRCTC");
		System.out.println("Hello" + name);
		
		synchronized (this) {
			
			if(tickets<noOfTicket) {
				System.out.println("The tickets are not available");
				System.out.println("=========");
			} else {
				System.out.println("Total No. of tickets booked are " + noOfTicket);
				tickets=noOfTicket;
				System.out.println("Total number of tickets left :" +tickets);
				System.out.println("==========");
			}
			
		}
		
		System.out.println("Thank You!!! Wear Mask!!! Happy Journey!!!");
		System.out.println("Thank You!!! Wear Mask!!! Happy Journey!!!");
		System.out.println("Thank You!!! Wear Mask!!! Happy Journey!!!");
	}


}
