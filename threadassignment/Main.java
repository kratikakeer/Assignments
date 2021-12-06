package com.te.threadassignment;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo thread = new ThreadDemo();

		thread.start();
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);

		}

	}

}
