package com.te.printerusingthread;

public class Praveen extends Thread {

	Printer printer;

	public Praveen(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			printer.print("Praveen printing");
		}
	}

}
