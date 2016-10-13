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
}