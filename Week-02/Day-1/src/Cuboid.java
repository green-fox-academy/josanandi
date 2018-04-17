import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        System.out.println("Please enter the lenght, height and width of a cuboid!");
        Scanner scanner = new Scanner(System.in);
        double lenght = scanner.nextDouble();
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();

        double surface=2*height*(lenght+width);
        double volume=lenght*width*height;

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: "+ volume);

    }
}
