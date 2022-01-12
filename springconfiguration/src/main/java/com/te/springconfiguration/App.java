package com.te.springconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springconfigurationbean.ComponentConfig;
import com.te.springconfigurationbean.Config;


public class App {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(ComponentConfig.class);
		
//		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
//		Pet pet = container.getBean(Pet.class);
//		pet.doThings();
		
		Pet pet = container.getBean("pet", Pet.class);
		pet.doThings();
	}

}

