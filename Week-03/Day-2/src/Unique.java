import sun.reflect.generics.tree.ArrayTypeSignature;

import java.util.*;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(Arrays.toString(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34})));
        //  should print: `[1, 11, 34, 52, 61]`
    }


    public static int[] unique(int[] numbers) {
        int newLength = numbers.length;
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if ((i != numbers.length - 1) && (numbers[i] == numbers[i + 1])) {
                newLength--;
            }
        }

        int[] uniqueList = new int[newLength];
        for (int i = 0; i < numbers.length; i++) {
            Arrays.sort(uniqueList);
            int check = Arrays.binarySearch(uniqueList, numbers[i]);
            if (check > 0) {
                continue;
            } else {
                int checkForZero = Arrays.binarySearch(uniqueList, 0);
                uniqueList[checkForZero] = numbers[i];
            }

        }
        Arrays.sort(uniqueList);
        return uniqueList;

    }


}