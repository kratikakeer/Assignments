package com.te.loosecoupling;

public class Customer {

		public static void main(String[] args) {
			Chef f = new Chef();
			f.chef(new Italian());
			f.chef(new Chinese());
		}
} 
