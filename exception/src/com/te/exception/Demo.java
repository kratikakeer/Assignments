package com.te.exception;

public class Demo {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader();
		}  catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

}
