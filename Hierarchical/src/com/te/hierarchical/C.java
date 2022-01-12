package com.te.hierarchical;

public class C extends A {
	public void m3() {
		System.out.println("Sing a Song");
	}

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.m1();
		b.m2();
		c.m3();
	}
}
