package com.te.staticanddefault;

public class Maharashtra implements PhoneCall {

	@Override
	public void busyMessage() {
		System.out.println("Vyasta ahe");

	}

	@Override
	public void covidAlert() {
		System.out.println("Jai Maharashtra");
		PhoneCall.super.covidAlert();
	}

}
