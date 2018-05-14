import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String input1, String input2) {
        String[] newInput1 = input1.split("");
        String[] newInput2 = input2.split("");

        Arrays.sort(newInput1);
        Arrays.sort(newInput2);

        return (Arrays.equals(newInput1, newInput2));
    }
}