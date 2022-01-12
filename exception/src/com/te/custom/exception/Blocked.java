package com.te.custom.exception;

public class Blocked extends Exception {
	String message;
	
	public Blocked(String message) {
		this.message = message;
	}
	

}
