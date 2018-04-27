import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0
        System.out.println("Please enter a divider");
        Scanner input = new Scanner(System.in);
        int divider = input.nextInt();
        System.out.println(dividerFunction(divider));

    }


    public static double dividerFunction (int divider) {
        double result = 0.0;
        try {
            result = 10/divider;
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
        return result;

    }
}
