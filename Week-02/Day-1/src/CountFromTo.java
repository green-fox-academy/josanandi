import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
    // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"

    // If it is bigger it should count from the first number to the second by one

        System.out.println("Please enter two numbers");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number2 < number1) {
            System.out.println("The second line should be bigger");
        }
        else{
            for (int i = number1; i < number2 ; i++) {
                System.out.println(i);
            }
        }

    }

}
