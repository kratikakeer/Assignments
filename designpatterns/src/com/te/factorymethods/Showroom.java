package com.te.factorymethods;

public class Showroom {
	Brand brand;
	
	public void showBrand(String s) {
		
		if(s.equalsIgnoreCase("Zara")) {
			brand = new Zara();
			System.out.println(s + " Stock Available!!");
		}
		else if(s.equalsIgnoreCase("Levis")) {
			brand = new Levis();
			System.out.println(s + " Stock Available!!");
		}
		else if(s.equalsIgnoreCase("Westside")) {
		    System.out.println(s + " Stock Available!!");
			brand = new Westside();
		}
		else
			System.out.println("Not Available!!");
		
		if(brand != null) {
			brand.jeans();
			brand.shirts();
			brand.tshirt();
		}
	}
}
