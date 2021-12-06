package com.te.assignment;

public abstract class Developer extends Employee {
	Developer(String ename, String designation, double sal) {
		super(ename, designation, sal);

	}

	public abstract void code();

	public abstract void project();

	public abstract void experience();

}
