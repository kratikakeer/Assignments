package com.te.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MyClass {
	public static void main(String[] args) {
//		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(BeanConfig.class);
//		Demo bean = (Demo)con.getBean("demo");
//		bean.name();
//        con.close();
		
		
		AbstractApplicationContext con = new AnnotationConfigApplicationContext(BeanConfig.class);
		con.registerShutdownHook();
		Demo bean = (Demo)con.getBean("demo");
		bean.name();
		System.out.println(bean.hashCode());
		
	}

}
