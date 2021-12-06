package com.te.arrays;

import java.util.Scanner;

public class ArrayExercise {
  public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("enter the array length");
	int n= obj.nextInt();
	System.out.println("enter the array element");
	int[] a=new int[n];
	for(int i=0; i<a.length; i++) {
		a[i]=obj.nextInt();
	}
	int count=0;
	for(int i=0; i<a.length;i++) {
		if(a[i]==3 && a[i+1]!=3) {
			count++;
		}
	}
	if(count==3) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
}
}
