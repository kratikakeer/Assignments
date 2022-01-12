package com.te.springconfiguration;

import org.springframework.stereotype.Component;

@Component
public class Praveen implements Animal {

	@Override
	public void makesound() {
		System.out.println("bla bla bla");
		
	}

	@Override
	public void eat() {
		System.out.println("eats food");
		
	}

	@Override
	public boolean isPet() {
		return false;
	}

}
