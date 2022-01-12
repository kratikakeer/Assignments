package com.te.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS) // for before all method
class CalculactorTest {

	Calculator calc;

	@BeforeAll
	public void beforeall() {
		System.out.println("before everything");

	}

	@BeforeEach
	void init() {
		calc = new Calculator();
		System.out.println("new instance created");

	}

	@AfterEach
	void afterCalculation() {
		System.out.println("process completed");
	}

	@Test
	@DisplayName("ADDITION")
	void test() {
		assertEquals(7, calc.add(5, 2));
		System.out.println("addition completed");

	}

	@Test
	void multi() {
		assertEquals(10, calc.multiplication(5, 2));
		System.out.println("multiplication completed");

	}

	@Test
	void areaOFCircleTest() {
		assertEquals(314.159265358979323846, calc.areaOfCircle(10));
		System.out.println("area of circle completed");
	}

	@Test
	void division() {
		assertThrows(ArithmeticException.class, () -> calc.division(10, 0));
		System.out.println("division completetd");
	}

}
