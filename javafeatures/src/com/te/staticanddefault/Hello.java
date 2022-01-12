package com.te.staticanddefault;

public class Hello {
	public static void main(String[] args) {
		PhoneCall call1 = new Maharashtra();
		PhoneCall call2 = new Tamilnadu();
		PhoneCall call3 = new Karnataka();

		call1.busyMessage();
		call2.busyMessage();
		call3.busyMessage();
		System.out.println("==============");
		call1.covidAlert();
		call2.covidAlert();
		call3.covidAlert();

	}

}
