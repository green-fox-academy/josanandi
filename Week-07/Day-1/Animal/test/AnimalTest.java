import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Animal testanimal = new Animal();

    @Test
    public void testCreationOfAnimal(){

        int expectedHungerValue = 50;
        int expectedThirstVAlue = 50;

        assertEquals(expectedHungerValue, testanimal.hunger);
        assertEquals(expectedThirstVAlue, testanimal.thirst);

    }

    @Test
    public void testEatandDrinkMethod(){
        int expectedHungerValue = 49;
        int expectedThirstVAlue = 49;

        testanimal.eat();
        testanimal.drink();

        assertEquals(expectedHungerValue,testanimal.hunger);
        assertEquals(expectedThirstVAlue, testanimal.thirst);
    }

    @Test
    public void testPlayMethod(){
        int expectedHungerValue = 51;
        int expectedThirstVAlue = 51;

        testanimal.play();

        assertEquals(expectedHungerValue,testanimal.hunger);
        assertEquals(expectedThirstVAlue, testanimal.thirst);
    }


    public void testEatandDrinkMethod50X(){
        int expectedHungerValue = 0;
        int expectedThirstVAlue = 0;

        for (int i = 0; i < 50 ; i++) {
            testanimal.drink();
            testanimal.eat();
        }
        assertEquals(expectedHungerValue,testanimal.hunger);
        assertEquals(expectedThirstVAlue, testanimal.thirst);

    }

    @Test
    public void testEatandDrinkMethod51X(){
        int expectedHungerValue = 0;
        int expectedThirstVAlue = 0;

        for (int i = 0; i < 51 ; i++) {
            testanimal.drink();
            testanimal.eat();
        }
        assertEquals(expectedHungerValue,testanimal.hunger);
        assertEquals(expectedThirstVAlue, testanimal.thirst);

    }
    @Test
    public void testEatandDrinkMethod53X(){
        int expectedHungerValue = 0;
        int expectedThirstVAlue = 0;

        for (int i = 0; i < 53 ; i++) {
            testanimal.drink();
            testanimal.eat();
        }
        assertEquals(expectedHungerValue,testanimal.hunger);
        assertEquals(expectedThirstVAlue, testanimal.thirst);

    }


}