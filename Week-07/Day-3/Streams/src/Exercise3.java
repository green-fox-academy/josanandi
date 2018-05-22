import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        long[] squaredNumbers = numbers.stream()
                            .mapToLong(number -> number*number)
                            .toArray();
        System.out.println(Arrays.toString(squaredNumbers));
    }
}
