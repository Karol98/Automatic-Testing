import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Before");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("After");
    }

    @Test
    public void testAdding() {
        int result = calculator.adding(20, 380);
        assertEquals(400, result);
        System.out.println("Test1");
    }


    @Test
    public void testSubstracting() {
        int result = calculator.substracting(399, 99);
        assertEquals(300, result);
        System.out.println("Test2");
    }

    @Test
    public void testDividing() {
        int result = calculator.division(500, 50);
        assertEquals(10, result);
        System.out.println("Test 3");
    }


    @Test
    public void testMultiplying() {
        int result = calculator.multiplication(10, 12);
        assertEquals(120, result);
        System.out.println("Test 4");
    }

    @Test
    public void testThrowExceptionDividedByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.division(20,0));
        assertSame(exception.getClass(), ArithmeticException.class);
        System.out.println("Test 5");
    }

    @Test
    public void testCompareTheNumbersTrue() {
        boolean result = calculator.compareTheNumbers(20,20);
        assertTrue(result);
        System.out.println("Test 6");
    }

    @Test
    public void testCompareTheNumbersFalse() {
        boolean result = calculator.compareTheNumbers(10,11);
        assertFalse(result);
        System.out.println("Test 7");
    }

    @Test
    public void testCalculatorNotNull() {
        assertNotNull(calculator);
        System.out.println("Test 8 ");
    }

    @Test
    public void testMultiplying2() {
        int result = calculator.multiplication(10, -10);
        assertEquals(-100, result);
        System.out.println("Test 9");
    }

    @Test
    public void testSubstracting2() {
        int result = calculator.substracting(230, -20);
        assertEquals(250, result);
        System.out.println("Test 10");
    }
}