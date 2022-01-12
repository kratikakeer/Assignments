package com.te.stringmethods;

public class EqualsExample {
	
	    public static void main(String[] args) {
	        String str = "javaguides";
	        String str1 = "javaguides";
	        String str3 = "javatutorial";
	        boolean equal = str.equals(str1);
	        System.out.println("String are equals :: " + equal);
	        boolean equal2 = str.equals(str3);
	        System.out.println("String are equals :: " + equal2);
	    }
}

