import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testForIndex5GenerateFibonacciNumberSequence() {
        Fibonacci test1 = new Fibonacci();

        List<Integer> result = new ArrayList<>();
        result = test1.generateFibonacciSequence(6);

        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5));
        assertEquals(expected, result);

    }

    @Test
    public void testForIndex0GenerateFibonacciNumberSequence() {
        Fibonacci test1 = new Fibonacci();

        List<Integer> result = new ArrayList<>();
        result = test1.generateFibonacciSequence(0);

        List<Integer> expected = new ArrayList<>(Arrays.asList(0));
        assertEquals(expected, result);

    }


    @Test
    public void testForIndexNegative2GenerateFibonacciNumberSequence() {
        Fibonacci test1 = new Fibonacci();

        List<Integer> result = new ArrayList<>();
        result = test1.generateFibonacciSequence(-2);

        List<Integer> expected = new ArrayList<>(Arrays.asList(0));
        assertEquals(expected, result);

    }
   
}