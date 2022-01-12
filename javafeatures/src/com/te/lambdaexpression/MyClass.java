package com.te.lambdaexpression;

public class MyClass {
	
	public static int sum(int i, int j) {
		return i+j;
	}
	
	public static int sub(int i, int j) {
		return i-j;
	}
	
	public int addition(int i, int j) {
		return i+j;
	}
	
	
	public static void main(String[] args) {
		
		//method reference
		
//		Test test = new MyClass()::addition;
//		System.out.println(test.add(10, 20));
//		
//		Test test2 = MyClass::sum;
//		System.out.println(test.add(50, 100));
//		
		
//		
//		Test test1 = new Test();
//		System.out.println("============");

		Test test1 = (i,j)-> {
			return i+j;
		};
		
		int add = test1.add(10,20);
		System.out.println(add);
		
		
		Runnable run = ()-> {
			for(int i=0;i<5;i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(run);
		thread.start();
		System.out.println("============");
		thread.run();
	}
	

}
