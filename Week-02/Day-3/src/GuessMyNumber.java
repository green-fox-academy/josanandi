import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {
        //Write a program where the program chooses a number between 1 and 100. The player is then asked to enter a guess.
        // If the player guesses wrong, then the program gives feedback and ask to enter an other guess until the guess is correct.
        // Make the range customizable (ask for it before starting the guessing).
        // You can add lives. (optional)


        guessTheNumber();
    }
    private static void guessTheNumber(){
        System.out.println("Please guess the number. It is an integer between 1-100.You have 10 lives.");
        int numberToGuess = (int)(Math.random()*100)+1;
        Scanner input = new Scanner(System.in);
        int lives = 10;
        boolean condition = true;
        while (condition && lives>0){
            int guess = input.nextInt();
            if (guess == numberToGuess) {
                System.out.println("Congratulations. You won!");
                condition = false;
            }
            else if(guess > numberToGuess) {
                System.out.println( "Too high. You have " + lives + " lives left.");
                lives--;
            }
            else{
                System.out.println( "Too low. You have " + lives + " lives left.");
                lives--;
            }
        }
        if (condition && lives == 0){
            System.out.println("Game over! No more lives left. The number was: "+ numberToGuess);
        }
    }
}

