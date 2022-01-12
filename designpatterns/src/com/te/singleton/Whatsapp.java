package com.te.singleton;

public class Whatsapp {
	static Whatsapp whatsapp;

	private Whatsapp() {
	}

	static Whatsapp helperMethod() {
		if (whatsapp == null) {
			whatsapp = new Whatsapp();
			return whatsapp;
		}
		return whatsapp;
	}

}
