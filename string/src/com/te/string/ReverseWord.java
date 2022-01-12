package com.te.string;

public class ReverseWord {
	public static void main(String[] args) {
		String n = "This is mock";
		String reverse = "";
		String[] array = n.split(" ");
		for (int i = 0; i < array.length; i++) {
			String word = array[i];
			for (int j = word.length()-1; j>=0; j--) {
				reverse = reverse+word.charAt(j);	
			}
			reverse = reverse + " ";
		}
		System.out.println(reverse);
	}

}
