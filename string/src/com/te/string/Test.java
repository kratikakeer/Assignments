package com.te.string;

public class Test {
	public static void main(String[] args) {
//		String name ="Kratika";
//		String s = "Kratika";
//		System.out.println(name==s);
		
		String n = "My Name Is Kratika";
//		n= n.toUpperCase();
//		System.out.println(n.length());
//		System.out.println(n);
		String[] m = n.split(" ",2);
		for(String x:m) {
			System.out.println(x);
		}
	}

}
