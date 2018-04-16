import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle

        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String brick= "";

        for (int i=0; i < number; i++) {
            brick = brick + "*";
            System.out.println(brick);
        }

    }
}
