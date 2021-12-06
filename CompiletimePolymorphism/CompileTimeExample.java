package com.te.compiletimepolymorphism;

public class CompileTimeExample {

	public int add(int x, int y) {
		return x + y;
	}

	public int add(int x, int y, int z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		CompileTimeExample obj = new CompileTimeExample();
		System.out.println(obj.add(89, 66));
		System.out.println(obj.add(90, 75, 64));
	}

}
