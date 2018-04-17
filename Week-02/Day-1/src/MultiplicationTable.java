import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Create a program that asks for a number and prints the multiplication table with that number

        System.out.println("Please enter a number!");
        Scanner input = new Scanner(System.in);
        int number =Integer.parseInt(input.nextLine());

        for (int i = 1; i <= 10; i ++ ) {
            System.out.println(i + " * " + number + " = " + (i*number));
        }
    }
}
