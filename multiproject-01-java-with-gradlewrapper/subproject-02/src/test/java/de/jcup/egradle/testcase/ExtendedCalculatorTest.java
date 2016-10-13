package de.jcup.egradle.testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExtendedCalculatorTest {
	private ExtendedCalculator calcToTest;

	@Before
	public void before() {
		calcToTest = new ExtendedCalculator();
	}

	@Test
	public void initialized_add_1__results_in_1() {

		/* execute */
		calcToTest.add(1);
		/* test */
		assertEquals(1, calcToTest.getResult());
	}
	
	@Test
	public void initialized_add_2__results_in_2() {

		/* execute */
		calcToTest.add(2);
		/* test */
		assertEquals(2, calcToTest.getResult());
	}
	
	@Test
	public void initialized_add_minus1__results_in_minus1() {

		/* execute */
		calcToTest.minus(1);
		/* test */
		assertEquals(-1, calcToTest.getResult());
	}

}
