package io.vgovindev;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("When running MathUtils")
class MathUtilsTest {
	MathUtils mathUtils;

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@Nested
	@DisplayName("add method")
	@Tag("Math")
	class AddTest {
		@Test
		@DisplayName("when adding two positive numbers")
		void testAddPositive() {
			assertEquals(2, mathUtils.add(1, 1), () -> "should return the right sum");

		}

		@Test
		@DisplayName("when adding the two negative numbers")
		void testAddNegative() {
			assertEquals(-2, mathUtils.add(-1, -1), () -> "should return the right sum");

		}

	}

	@Test
	@Tag("Math")
	@DisplayName("multiply method")
	void testMultiply() {
		// assertEquals(4, mathUtils.multiply(2, 2), "Should return the right product");
		assertAll(() -> assertEquals(4, mathUtils.multiply(2, 2)), () -> assertEquals(0, mathUtils.multiply(2, 0)),
				() -> assertEquals(-2, mathUtils.multiply(2, -1)));

	}

	@Test
	@Tag("Math")
	void testDivide() {
		// assumeTrue(value); -> Run only the test if this value is true.
		// For eg : boolean isServerup = false;
		// assumeTrue(isServerup)
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "divide by zero should throw");
	}

	// @Test
	// @RepeatedTest(3)
	@Tag("Circle")
	void testComputeCircleArea() {
		// Useful methods are
		// repetitionInfo.getCurrentRepetition();
		// repetitionInfo.getTotalRepetitions();
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

	// Other handy annotations
	// Conditional Execution
	// @EnableOnOs(OS.LINUX
	// @EnableOnJre(JRE.JAVA_11)
	// @EnableIf
	// @EnableIfSystemProperty
	// @EnableIfEnvironmentVariable

}
