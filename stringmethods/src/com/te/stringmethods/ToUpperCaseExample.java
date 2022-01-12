package com.te.stringmethods;

import java.util.Locale;

public class ToUpperCaseExample {
	
	    public static void main(String[] args) {
	        String str = "Facebook";
	        String str2 = str.toUpperCase();
	        System.out.println(str2);
	        str2 = str.toUpperCase(Locale.ENGLISH);
	        System.out.println(str2);
	    }

}
