import java.util.ArrayList;
import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
        int[] squareGreaterThan20 = numbers.stream()
                                    .mapToInt(number -> number*number)
                                    .filter(number -> number >20)
                                    .toArray();
        System.out.println(Arrays.toString(squareGreaterThan20));
    }
}
