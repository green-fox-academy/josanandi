import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void testTotalOfTheSumMethod() {
        Sum sum1 = new Sum();
        sum1.getIntegerList().addAll(Arrays.asList(1, 2, 3, 4));
        int expectedValue = 10;
        int resultValue = sum1.sum();
        assertEquals(expectedValue, resultValue);
    }

    @Test
    public void testTotalOfTheSumMethodWithEmptyArray() {
        Sum sum1 = new Sum();
        sum1.getIntegerList().addAll(Arrays.asList());
        int expectedValue = 0;
        int resultValue = sum1.sum();
        assertEquals(expectedValue, resultValue);
    }

    @Test
    public void testTotalOfTheSumMethodWithOneElement() {
        Sum sum1 = new Sum();
        sum1.getIntegerList().addAll(Arrays.asList(1));
        int expectedValue = 1;
        int resultValue = sum1.sum();
        assertEquals(expectedValue, resultValue);
    }

    @Test
    public void testTotalOfTheSumMethodWithNullArray() {
        Sum sum1 = new Sum();
        int expectedValue = 0;
        int resultValue = sum1.sum();
        assertEquals(expectedValue, resultValue);

    }
}