package com.te.springconfiguration;

import org.springframework.stereotype.Component;

@Component
public class Yashwanth implements Animal{

	@Override
	public void makesound() {
		System.out.println("bak bak bak");
		
	}

	@Override
	public void eat() {
		System.out.println("He eats food");
		
	}

	@Override
	public boolean isPet() {
		return false;
	}

}
