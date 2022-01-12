package com.te.factorymethods;

import java.util.Scanner;

public class Customers {

	public static void main(String[] args) {
		Showroom showroom = new Showroom();
		Scanner sc = new Scanner(System.in);
		System.out.println("Which brand you want??");
		String brand = sc.next();
		showroom.showBrand(brand);

	}

}
