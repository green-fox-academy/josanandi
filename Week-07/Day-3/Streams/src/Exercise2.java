import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.lang.Math.abs;

public class Exercise2 {
    public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    double averageOfOdds = numbers.stream()
                            .filter(number -> abs (number) % 2 == 1)
                            .mapToInt(number ->number.intValue())
                            .average()
                            .getAsDouble();
        System.out.println(averageOfOdds);
    }
}
