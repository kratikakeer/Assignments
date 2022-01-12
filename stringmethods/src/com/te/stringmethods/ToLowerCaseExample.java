package com.te.stringmethods;

import java.util.Locale;

public class ToLowerCaseExample {
	
	    public static void main(String[] args) {
	        String str = "INSTAGRAM";
	        String str2 = str.toLowerCase();
	        System.out.println(str2);
	        str2 = str.toLowerCase(Locale.ENGLISH);
	        System.out.println(str2);
	    }
}
