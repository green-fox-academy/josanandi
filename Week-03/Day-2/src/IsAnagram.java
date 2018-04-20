import java.util.Arrays;

public class IsAnagram {
   public static void main(String[] args) {
       //Create a function named is anagram following your current language's style guide.
       //It should take two strings and return a boolean value depending on whether its an anagram or not.
       String input1 = "dog";
       String input2 = "gdo";

       System.out.println(isAnagram(input1, input2));
   }

    private static boolean isAnagram(String input1, String input2) {
        String[] newInput1 = input1.split("");
        String[] newInput2 = input2.split("");

        Arrays.sort(newInput1);
        Arrays.sort(newInput2);

        return (Arrays.equals(newInput1, newInput2));
    }
}
