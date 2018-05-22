import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        String word = "djklsjtrosnefvs skne sdo9f'l";
        List<Character> characters =
                word.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> Character.charCount(c)));
    }
}
