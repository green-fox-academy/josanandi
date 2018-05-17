import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {


    Sharpie sharpie1 = new Sharpie("orange", (float)0.5);

    @Test
    public void testCreateSharpieOrange_05(){

        String expectedColorValue = "orange";
        float expectedWidthValue = (float)0.5;
        float expectedInkAmount = 100;

        assertEquals(expectedColorValue, sharpie1.color);
        assertEquals(expectedWidthValue, sharpie1.width, 0);
        assertEquals(expectedInkAmount, sharpie1.inkAmount, 0);


    }

    @Test
    public void testFirstUseSharpie(){

        String expectedColorValue = "orange";
        float expectedWidthValue = (float)0.5;
        float expectedInkAmount = 90;

        sharpie1.use();

        assertEquals(expectedColorValue, sharpie1.color);
        assertEquals(expectedWidthValue, sharpie1.width, 0);
        assertEquals(expectedInkAmount, sharpie1.inkAmount,0);
    }

    @Test
    public void testUseSharpie10x(){

        String expectedColorValue = "orange";
        float expectedWidthValue = (float)0.5;
        float expectedInkAmount = 0;

        for (int i = 0; i < 10; i++) {

            sharpie1.use();
        }

        assertEquals(expectedColorValue, sharpie1.color);
        assertEquals(expectedWidthValue, sharpie1.width, 0);
        assertEquals(expectedInkAmount, sharpie1.inkAmount,0);
    }

    @Test
    public void testUseSharpie11x(){

        String expectedColorValue = "orange";
        float expectedWidthValue = (float)0.5;
        float expectedInkAmount = 0;

        for (int i = 0; i < 11; i++) {

            sharpie1.use();
        }

        assertEquals(expectedColorValue, sharpie1.color);
        assertEquals(expectedWidthValue, sharpie1.width, 0);
        assertEquals(expectedInkAmount, sharpie1.inkAmount,0);
    }



}