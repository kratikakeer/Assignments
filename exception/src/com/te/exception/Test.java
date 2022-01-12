package com.te.exception;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter the number 1");
		Scanner scan =new Scanner(System.in);
		x=scan.nextInt();
		System.out.println("Enter the number 2");
		y=scan.nextInt();
		try {
			int result=x/y;
			System.out.println(result);
			System.out.println("End program");
		} catch (ArithmeticException e) {
			System.out.println("Infinite");
		}	
	}
}

