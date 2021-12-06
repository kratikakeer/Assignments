package com.te.printerusingthread;

public class Shashi extends Thread {

	Printer printer;

	public Shashi(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		for (int i = 0; i < 6; i++) {
			printer.print("Shashi printing");
		}

	}
}
