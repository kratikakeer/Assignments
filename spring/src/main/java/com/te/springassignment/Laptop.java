package com.te.springassignment;

public class Laptop {
	String brand;
	double cost;
	String processor;
	Battery battery;
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public Laptop(String brand, double cost) {
		super();
		this.brand = brand;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", cost=" + cost + ", processor=" + processor + ", capacity=" + battery.capacity +" , volt= "+ battery.volt+"]";
	}
	
	
	
	
	
	
	
}
