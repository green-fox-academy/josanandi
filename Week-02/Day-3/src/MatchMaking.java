import java.util.ArrayList;
import java.util.Arrays;

public class MatchMaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(ArrayList girls, ArrayList boys) {
        ArrayList<String> mixedList = new ArrayList<String>();
        if (girls.size() > boys.size()) {

            while (!girls.isEmpty()) {
                if(!boys.isEmpty()){
                    mixedList.addAll(Arrays.asList(girls.get(0).toString(), boys.get(0).toString()));
                    girls.remove(0);
                    boys.remove(0);
                }
                else{
                    mixedList.addAll(Arrays.asList(girls.get(0).toString()));
                    girls.remove(0);
                }

            }
        } else {
            while (!boys.isEmpty()) {
                if(!girls.isEmpty()){
                    mixedList.addAll(Arrays.asList(boys.get(0).toString(), girls.get(0).toString()));
                    girls.remove(0);
                    boys.remove(0);
                }
                else{
                mixedList.addAll(Arrays.asList(boys.get(0).toString()));
                boys.remove(0);
                }

            }
        }
        return mixedList;
    }
}

