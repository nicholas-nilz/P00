import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testAddError() {
		int a = 400;
		int b = 500;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int unexpected = 900;
		assertEquals (unexpected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testSubtractError() {
		int a = 400;
		int b = 500;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int unexpected = -100;
		assertEquals (unexpected, actual);
	}
	
	@Test
	public void testMultiply() {
		int a = 4;
		int b = 5;

		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
	
		int expected = 20;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyError() {
		int a = 400;
		int b = 500;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int unexpected = 200000;
		assertEquals (unexpected, actual);
	}
	
	
	@Test
	public void testDivide() {
		int a = 10;
		int b = 2;
	
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
	
		int expected = 5;
		assertEquals (expected, actual);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		int a = 10;
		int b = 0;
		
		Calculator cal = new Calculator();
		double actual = cal.divide(a, b);
		
		double expected= Double.POSITIVE_INFINITY;
		assertEquals (expected, actual, 0.0);
	}
	

	
}
