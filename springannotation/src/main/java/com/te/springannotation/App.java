package com.te.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("annotation.xml");
		Salary bean = container.getBean(Salary.class);
		System.out.println(bean);
	}
}
