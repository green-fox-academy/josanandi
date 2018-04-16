import java.util.Scanner;

public class AnimalAndLegs{
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        System.out.println("Please enter the total number of chickens at the farm! ");
        Scanner scanner = new Scanner(System.in);
        int chickens = scanner.nextInt();
        System.out.println("Please enter the total number of pigs at the farm! ");
        int pigs = scanner.nextInt()    ;
        int totalAnimalLegs = chickens*2 + pigs*4;

        System.out.println("The total legs of the animals at the farms is: " + totalAnimalLegs);
    }
}

