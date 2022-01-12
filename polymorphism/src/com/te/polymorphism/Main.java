package com.te.polymorphism;

public class Main {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.m1();
		System.out.println(demo.x);
		System.out.println("=================");
		Test test = new Test();
		test.m1();
		System.out.println(test.x);
		System.out.println("=================");
		Test t = new Demo();
		t.m1();
		System.out.println(t.x);
		
		}
}
