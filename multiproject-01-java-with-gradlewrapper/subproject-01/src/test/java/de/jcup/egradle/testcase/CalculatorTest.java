package de.jcup.egradle.testcase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calcToTest;

	@Before
	public void before() {
		calcToTest = new Calculator();
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

}
