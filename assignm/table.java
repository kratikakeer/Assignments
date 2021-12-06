package com.te.forloop;

import java.util.Scanner;
public class table {
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int n = sc.nextInt();
	int result;
	int r=0;
	for(int i=1; i<=10; i++) {
		result=n*i;
		System.out.println(n+"*"+i+"="+result);
		r=result+r;	
	}
	System.out.println("total sum= "+ r);
	}
}
