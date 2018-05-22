import java.util.List;;
import java.util.stream.Collectors;;

public class Exercise5 {
    public static void main(String[] args) {
        String word = "ljdfgsnkBddkHl jrhgdW";

        List<Character> uppercase = word.chars()
                .mapToObj(letter -> (char)letter)
                .filter(letter -> Character.isUpperCase(letter))
                .collect(Collectors.toList());

        System.out.println(uppercase);
    }
}
