package com.te.springconfiguration;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {

	@Override
	public void makesound() {
		System.out.println("Bow bow bow");
		
	}

	@Override
	public void eat() {
		System.out.println("It eats pedigree");
		
	}

	@Override
	public boolean isPet() {
		return true;
	}

}
