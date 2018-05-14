import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    @Test
    public void testIsAnagramMethod(){
        Anagram anagram1 = new Anagram();
        boolean resultOfMethod = anagram1.isAnagram("dog", "god");
        assertTrue(resultOfMethod);
    }

}