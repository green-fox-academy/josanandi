import java.util.Arrays;

public class PalindromeBuilder {
    public static void main(String[] args) {
        //Create a function named is anagram following your current language's style guide.
        //It should take two strings and return a boolean value depending on whether its an anagram or not.
        String input = "dog";

        System.out.println(String.join("", palindromeBuilder(input)));

    }

    private static String[] palindromeBuilder(String input) {
        String[] newInput = input.split("");
        String[] temporaryInput = new String[newInput.length];

        for (int i = 0 ; i < newInput.length ; i++) {
            int j = newInput.length-1;
            temporaryInput[i] = newInput[j-i];
        }

        String[] palindrome = new String[newInput.length*2];
        if (!Arrays.equals(temporaryInput, newInput)) {

            for (int i = 0; i < newInput.length ; i++) {
                    palindrome[i] = newInput[i];
                }
            for (int i = 0; i <temporaryInput.length ; i++) {
                palindrome[newInput.length + i] = temporaryInput[i];
            }
        }

        return palindrome;
    }

}
