package com.te.string;

public class NumberPalindrome {
	public static void main(String[] args) {
		int num=121;
		int rem;
		int sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
        if(temp==sum) {
        	System.out.println("Palindrome");
        } else {
        	System.out.println("Not a Palindrome");
        }
	}

}
