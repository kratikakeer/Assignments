package com.te.annotationassignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Fish {
	@Value("Shark")
	String name;
	@Autowired
	Water water;
	@Override
	public String toString() {
		return "Fish [name=" + name + ", water=" + water + "]";
	}
	
	

}
