import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    @Test
    public void testTheOutputString(){
        Apple alma = new Apple();
        String expectedValue = "apple";
        String resultValue = alma.getApple();
        assertEquals(expectedValue, resultValue);

    }
}