import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
       // Write a simple program to check if a given number is an armstrong number.
       // The program should ask for a number. E.g. if we type 371, the program should print out: The 371 is an Armstrong number.
        System.out.println("Please enter a number to check if it is an Armstrong number");
        Scanner input  = new Scanner(System.in);
        long isArmstrongNumber = input.nextInt();
        System.out.println("The " + isArmstrongNumber +" is an Armstrong number: " + testArmstrongNumber(isArmstrongNumber));

    }
    private static boolean testArmstrongNumber(long isArmstrongnumber){
        int power = String.valueOf(isArmstrongnumber).length();
        long copyNumber = isArmstrongnumber;
        long result =0;
        
        while (copyNumber > 0) {
            result +=  Math.pow(copyNumber%10,power);
            copyNumber /= 10;
        }

        boolean condition = false;
        if (result == isArmstrongnumber){
            condition = true;
        }
        return condition;
    }
}
