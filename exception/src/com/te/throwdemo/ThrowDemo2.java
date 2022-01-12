package com.te.throwdemo;

public class ThrowDemo2 {
	public void bhushan() throws Exception {
		System.out.println("I did not do it");
		throw new Exception();
	}
	
	public static void main(String[] args) {
		System.out.println("Who has done it?");
		ThrowDemo2 td = new ThrowDemo2();
		try {
		    td.bhushan();
	    } catch (Exception e) {
	    	System.out.println("Exception occured");
	    }
	}
}
