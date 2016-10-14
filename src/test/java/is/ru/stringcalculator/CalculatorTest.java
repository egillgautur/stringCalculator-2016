package is.ru.stringcalculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class CalculatorTest {

    @Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

    @Test
    public void testOneNumber() {
        assertEquals(3, Calculator.add("3"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(7, Calculator.add("2,5"));
    }

    @Test
    public void testMultipleNumbers() {
        assertEquals(15, Calculator.add("1,2,3,4,5"));
    }

    @Test
    public void testNewLine() {
        assertEquals(11, Calculator.add("1\n2,3\n5"));
    }

    @Test(expected = RuntimeException.class)
    public void testNegative() {
        Calculator.add("-1,2");
    }

    @Test
    public void testBiggerThan1000() {
        assertEquals(2, Calculator.add("1001,2"));
    }
}