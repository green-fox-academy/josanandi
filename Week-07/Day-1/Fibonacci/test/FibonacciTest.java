import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testForIndex5GenerateFibonacciNumberSequence() {
        Fibonacci test1 = new Fibonacci();

        long expected = 3;
        long result = test1.generateFibonacciSequence(5);

        assertEquals(expected, result);

    }

    @Test
    public void testForIndex0GenerateFibonacciNumberSequence() {
        Fibonacci test1 = new Fibonacci();

        long expected = 0;
        long result = test1.generateFibonacciSequence(0);

        assertEquals(expected, result);

    }

    @Test
    public void testForIndex1GenerateFibonacciNumberSequence() {
        Fibonacci test1 = new Fibonacci();

        long expected = 1;
        long result = test1.generateFibonacciSequence(1);

        assertEquals(expected, result);

    }

    @Test
    public void testForIndexNegative22GenerateFibonacciNumberSequence() {
        Fibonacci test1 = new Fibonacci();

        long expected = 0;
        long result = test1.generateFibonacciSequence(-22);

        assertEquals(expected, result);
    }

    @Test
    public void testForIndex12GenerateFibonacciNumberSequence() {
        Fibonacci test1 = new Fibonacci();

        long expected = 144;
        long result = test1.generateFibonacciSequence(12);

        assertEquals(expected, result);
    }

    @Test
    public void testForIndex54GenerateFibonacciNumberSequence() {
        Fibonacci test1 = new Fibonacci();

        long expected = 86267571272L;

        long result = test1.generateFibonacciSequence(54);

        assertEquals(expected, result);
    }
}
