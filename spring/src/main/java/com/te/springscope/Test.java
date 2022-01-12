package com.te.springscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("configuration.xml");
		Object bean = container.getBean("demo");
		System.out.println(bean);
		Object bean2 = container.getBean("demo");
		System.out.println(bean2);
	
	}
}
