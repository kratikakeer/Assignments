package com.te.arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the array length");
		int n= obj.nextInt();
		System.out.println("enter the array element");
		int[] a=new int[n];
		for(int i=0; i<a.length; i++) {
			a[i]=obj.nextInt();
		}
		if(a.length>2) {
			System.out.println(a[0]+" ");
			System.out.println(a[1]);
		}
		else {
			System.out.println(a[0]);
		}
	}
}
