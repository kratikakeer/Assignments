package com.te.loosecoupling;

public class Italian extends Food {
	
		 @Override
	     public void starters() {
	    	 System.out.println("Mozzarella and Tomato Salad");
			}
	     @Override
	     public void maincourse() {
	    	 System.out.println("Margherita Pizza");
	     }
	     @Override
	     public void deserts() {
	    	 System.out.println("Pannacotta");
	     }

}

