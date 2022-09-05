import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void canAdd() {
        assertEquals(25, Calculator.add(5, 20));
    }
    @Test
    public void canSubtract() {
        assertEquals(15, Calculator.subtract(20, 5));
    }
    @Test
    public void canMultiply() {
        assertEquals(100, Calculator.multiply(20, 5));
    }
    @Test
    public void canDivide() {
        assertEquals(4, Calculator.divide(20, 5));
    }
}
