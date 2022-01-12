package com.te.springdependency;

public class TurboEngine implements Garage {
	
	String name;
	double capacity;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}


	@Override
	public void start() {
		System.out.println(name+" Turbo engine has startedand its capacity is " +capacity);
		
	}
	

}
