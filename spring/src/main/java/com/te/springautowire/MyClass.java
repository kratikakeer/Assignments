package com.te.springautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("autowire.xml");
		Laptop laptop = container.getBean(Laptop.class);
		System.out.println(laptop);
		//laptop.test();
	}

}
