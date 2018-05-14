import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
    @Test
    public void testCountTheLettersInString(){
        CountLetters test1 = new CountLetters();

        HashMap expectedValue = new HashMap();
        expectedValue.put("l",2);
        expectedValue.put("a",1);
        expectedValue.put("h",1);
        expectedValue.put("e",1);
        expectedValue.put("o",1);
        expectedValue.put("k",1);

        HashMap resultValue = test1.countTheLettersInString("helloka");

        assertTrue(expectedValue.toString().equals(resultValue.toString()));
    }
}