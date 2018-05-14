import java.util.HashMap;

public class CountLetters {

    public HashMap<Character, Integer> countTheLettersInString(String input) {
        int i = 0;
        HashMap counterOfCharacters = new HashMap();
        while (i < input.length()) {
            int counter = 1;
            if (counterOfCharacters.containsKey(input.charAt(i))) {
                i++;
            } else {
                for (int j = i + 1; j < input.length(); j++) {
                    if (input.charAt(i) == (input.charAt(j))) {
                        counter++;
                    }
                }
                counterOfCharacters.put(input.charAt(i), counter);
                i++;
            }
        }
        return counterOfCharacters;
    }
}
