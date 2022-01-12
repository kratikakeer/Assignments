package com.te.springconfigurationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springconfiguration.Dog;
import com.te.springconfiguration.Pet;
import com.te.springconfiguration.Praveen;
import com.te.springconfiguration.Yashwanth;

@Configuration
public class Config {
	
	@Bean("Dog")
	@Primary
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean("Praveen")
	public Praveen getPraveen() {
		return new Praveen();
	}
	
	@Bean("Yashwanth")
	public Yashwanth getYashwanth() {
		return new Yashwanth();
	}
	
	@Bean
	public Pet getPet() {
		return new Pet();
	}
	

}
