import java.util.Arrays;
import java.util.Collections;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `True` sort that list descending

        //  Example:
        System.out.println(Arrays.toString(bubble(new int[] {34, 12, 24, 9, 5})));
        //  should print [5, 9, 12, 24, 34]

        System.out.println(Arrays.toString(advancedBubble(new int[] {34, 12, 24, 9, 5}, true)));
        //  should print [34, 24, 12, 9, 5]
    }

    private static int[] advancedBubble(int[] numbers, boolean check) {
        if (check){
           Arrays.sort(numbers);

            for (int i = 0; i <numbers.length/2 ; i++) {
                int tempValue=0;
                int j = numbers.length-1;
                tempValue = numbers[i];
                numbers[i] = numbers[j-i];
                numbers[j-i] = tempValue;
            }
        }
        return numbers;
    }

    private static int[] bubble(int[] numbers) {
        Arrays.sort(numbers);
        return(numbers);
    }
}