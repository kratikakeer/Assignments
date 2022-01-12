package com.te.exception;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter the number 1");
		Scanner scan =new Scanner(System.in);
		x=scan.nextInt();
		System.out.println("Enter the number 2");
		y=scan.nextInt();
		try {
			int result = x/y;
			int[] arr = new int[result];
			arr[4] = 50;
			System.out.println(arr[4]);
			System.out.println(result);
		} catch (RuntimeException e) {
			//RuntimeException e = new ArithmeticException();
			//RuntimeException e = new ArrayIndexOutOfBoundsException();
		
			System.out.println("Exception occured");
		}
    }
}
