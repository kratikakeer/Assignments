package com.te.staticanddefault;

public interface PhoneCall {
	void busyMessage();

	default void covidAlert() {
		System.out.println("Amitabh Bachchan speaks Stay Safe!!!");
	}

}
