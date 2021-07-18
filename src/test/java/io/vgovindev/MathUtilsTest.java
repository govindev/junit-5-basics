package io.vgovindev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils mathUtils;

	@BeforeAll
	static void beforeAllInit() {
		// This method has to be static.
		// jUnit calls this even before an instance is created for this class
		// If you don't make it static it won't be call and will fail
		System.out.println("This needs to run before all");
	}

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up ...");
	}

	@Test
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "The add method should add two numbers");

	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "divide by zero should throw");
	}

	@Test
	void testComputeCircleAre() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");

	}

}
