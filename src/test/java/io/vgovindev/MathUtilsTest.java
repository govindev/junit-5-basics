package io.vgovindev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils mathUtils;

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@Test
	@DisplayName("Testing add Method")
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

	@Test
	@Disabled
	@DisplayName("TDD method. Shoud not run")
	void testDisabled() {
		// When you are doing TDD. Initially you create the test methods and annotate
		// them with @Disabled so these will be skipped. When you are done writing the
		// actual logic, you can remove the annotation and have the test in place.
		fail("This test should be disabled");
	}

}
