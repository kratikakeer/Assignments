package com.te.runtimepolymorphism;

public class Z {
	public static void main(String args[]) {
		X obj1 = new X();
		X obj2 = new Y();
		obj1.methodA();
		obj2.methodA();
	}

}
