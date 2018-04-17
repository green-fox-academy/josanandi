import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {
    public static void main(String... args){
        ArrayList<String> far = new ArrayList(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
    public static ArrayList appendA(ArrayList far){
        ArrayList<String> newList = new ArrayList<>();
        String helyesAllat = "";
        for (Object allat : far) {
            helyesAllat = allat+"a";
            newList.add(helyesAllat);
        }
        return newList;
    }
}
