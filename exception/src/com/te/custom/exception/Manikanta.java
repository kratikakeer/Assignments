package com.te.custom.exception;

public class Manikanta {
	public void happen() throws Blocked {
		System.out.println("Hello,Kutti");
		throw new Blocked("You r not eligible to be my soulmate kutti");
	}
    public static void main(String[] args) {
		Manikanta manikanta = new Manikanta();
		try {
		  manikanta.happen();
		}catch(Blocked e) {
			System.out.println(e.message);
		}
	}
}
