package com.te.string;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=123;
		int rem;
		int sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
