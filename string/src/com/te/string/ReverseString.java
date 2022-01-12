package com.te.string;

public class ReverseString {
	public static void main(String[] args) {
		String str= "Dream Big";
		String reverseStr = "";
		 
		for (int i=str.length()-1; i>=0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		System.out.println("Original String :"+str);
		System.out.println("Reverse of given string :" + reverseStr);
	} 
}