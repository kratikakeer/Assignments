package com.te.testambiguity;

public interface Test {
	
	default void m1() {
		System.out.println("From Test");
	}

}
