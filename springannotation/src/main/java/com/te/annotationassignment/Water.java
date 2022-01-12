package com.te.annotationassignment;

import org.springframework.beans.factory.annotation.Value;

public class Water {
	@Value("salt water")
	String type;

	@Override
	public String toString() {
		return "Water [type=" + type + "]";
	}
	
	
	

}
