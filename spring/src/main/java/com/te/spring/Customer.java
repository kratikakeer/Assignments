package com.te.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("configuration.xml");
		Pen pen = (Pen) con.getBean("pen");
		pen.write();
;	}

}
