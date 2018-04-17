import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        // Sum: 22, Average: 4.4

        int sum = 0;

        System.out.println("Please enter five integers in a row ");
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();

        input = new Scanner(line);

        while (input.hasNextInt()){
            sum += input.nextInt();
        }

        double average = sum/5;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
