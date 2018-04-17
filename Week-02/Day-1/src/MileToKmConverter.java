import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Please enter the distance in km-s! ");
        Scanner scanner = new Scanner(System.in);
        int distanceKm = scanner.nextInt();
        double distanceMiles = distanceKm*0.6213;

        System.out.println("The distance in Miles is: " + distanceMiles);
    }
}
