import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        /// Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        int number = 15;
        System.out.println("Please guess the number");

        Scanner input = new Scanner(System.in);
        int guessedNumber = input.nextInt();

        while (guessedNumber != number ) {
            if (guessedNumber > number) {
                System.out.println( "The stored number is lower");
                System.out.println("Please try again");
                guessedNumber = input.nextInt();
            }
            else {
                System.out.println( "The stored number is higher");
                System.out.println("Please try again");
                guessedNumber = input.nextInt();
            }
        }

        System.out.println("The stored number is: " + number);


    }
}
