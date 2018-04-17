import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        System.out.println("Could you please enter a number");
        Scanner scanner = new Scanner( System.in);
        int a = scanner.nextInt();
        System.out.println("Could you please enter another number");
        int b = scanner.nextInt();

        if ( a > b){
            System.out.println("The bigger number is " + a);
        }
        else if (b>a) {
            System.out.println("The bigger number is " + b);
        }
        else{
            System.out.println("The numbers are equal");
        }
    }
}
