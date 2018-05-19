
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(generateFibonacciSequence(12));
    }

    public static long generateFibonacciSequence(int index){
        long fibonacciNumber = 0;
        if (index <= 0){
            return fibonacciNumber;
        }
        else if (index == 1){
            fibonacciNumber = 1;
            return fibonacciNumber;
            }
        else{
            long fibonacciNumber0 =0;
            long fibonacciNumber1 = 1;
            for (int i = 2; i <= index ; i++) {
             fibonacciNumber = fibonacciNumber0 + fibonacciNumber1;
             fibonacciNumber0 = fibonacciNumber1;
             fibonacciNumber1 = fibonacciNumber;


            }
        }
        return fibonacciNumber;
    }

}
