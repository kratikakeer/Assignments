package com.te.annotationassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Earth {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("assignment.xml");
		Fish bean = container.getBean(Fish.class);
		System.out.println(bean);
	}

}
