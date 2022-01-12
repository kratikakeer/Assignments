package com.te.testambiguity;

public class Demo implements Test, Test2 {

	@Override
	public void m1() {
		System.out.println("From Demo");
	}
}
