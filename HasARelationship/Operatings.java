package com.te.hasarelation;

public class Operatings {
	String brand;
	double version;
	double bit;
	public Operatings(String brand, double version, double bit) {
		super();
		this.brand = brand;
		this.version = version;
		this.bit = bit;
	}
	@Override
	public String toString() {
		return "Operatings [brand=" + brand + ", version=" + version + ", bit=" + bit + "]";
	}
	
	
	

}

