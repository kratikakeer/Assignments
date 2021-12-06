package com.te.printerusingthread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Printer printer = new Printer();
		Shashi shashi = new Shashi(printer);
		Praveen praveen = new Praveen(printer);

		shashi.start();
		praveen.start();
		shashi.setPriority(10);
		// Shashi.join();
		praveen.join();

	}

}
