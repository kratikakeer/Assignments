package com.te.loosecoupling;

public class Chef {
	
		public void chef(Food food) {
			food.starters();
			food.maincourse();
			food.deserts();
	}
}
