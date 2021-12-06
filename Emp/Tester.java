package com.te.assignment;

public abstract class Tester extends Employee {
	Tester(String ename, String designation, double sal) {
		super(ename, designation, sal);

	}

	public abstract void test();

	public abstract void experience();
}
