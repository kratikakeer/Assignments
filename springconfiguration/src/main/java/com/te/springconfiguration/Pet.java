package com.te.springconfiguration;

import org.springframework.beans.factory.annotation.Autowired;

public class Pet {
	String name;
	@Autowired
	Animal animal;
	
	public void doThings() {
		if(animal.isPet()) {
			animal.eat();
			animal.makesound();		
			}else {
				System.out.println("This is not pet");
			}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

}
