import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {

    }

    public List<Integer> generateFibonacciSequence(int index){
        List<Integer> fibonacciNumbersList = new ArrayList<>();

        if (index <= 0){
            fibonacciNumbersList.add(0);
        }
        else if (index == 1){
            fibonacciNumbersList.addAll(Arrays.asList(0,1));
            }
        else{
            fibonacciNumbersList.addAll(Arrays.asList(0,1));
            for (int i = 2; i <index ; i++) {
             fibonacciNumbersList.add(fibonacciNumbersList.get(i-2) +fibonacciNumbersList.get(i-1));
            }
        }
        return fibonacciNumbersList;
    }

}
