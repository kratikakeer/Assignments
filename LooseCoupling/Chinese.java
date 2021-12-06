package com.te.loosecoupling;

public class Chinese extends Food {
		
		 @Override
	     public void starters() {
	    	 System.out.println("Hot and Sour Soup");
			}
	     @Override
	     public void maincourse() {
	    	 System.out.println("Hakka noodles");
	     }
	     @Override
	     public void deserts() {
	    	 System.out.println("Vanilla icecream");
	     }
}
