package com.te.string;

public class Duplicates {

	public static String removeDuplicates(String str) {
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			String str3 = "" + str.charAt(i);
			if (!str2.contains(str3)) {
				str2 = str2 + str3;
			}
		}
		return str2;
	}

	public static void main(String[] args) {
		System.out.println(removeDuplicates("goodmorning"));
	}
}

