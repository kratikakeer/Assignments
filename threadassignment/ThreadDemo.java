package com.te.threadassignment;

public class ThreadDemo extends Thread {
	static char[] c = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

	public void run() {
		for (int j = 1; j < 10; j++) {
			System.out.println(c[j]);
			try {
				Thread.sleep(1050);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
