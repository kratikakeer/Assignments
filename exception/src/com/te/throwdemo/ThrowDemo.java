package com.te.throwdemo;

public class ThrowDemo {
	public void bhushan() {
		System.out.println("I did not do it");
		throw new ArrayIndexOutOfBoundsException();
	}
	public static void main(String[] args) {
		System.out.println("Who has done it?");
		ThrowDemo td = new ThrowDemo();
		td.bhushan();
	}

}
