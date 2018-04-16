import java.util.Scanner;

class HelloMe {
    public static void main(String[] args) {
        // Modify this program to greet you instead of the World!
        System.out.println("Hello, Andreea!");
    }
}

class HumptyDumpty {
    public static void main(String[] args) {
        // Modify this program to print Humpty Dumpty riddle correctly
        System.out.println("Humpty Dumpty sat on a wall,");
        System.out.println("Humpty Dumpty had a great fall.");
        System.out.println("All the king's horses and all the king's men");
        System.out.println("Couldn't put Humpty together again.");
    }
}

class HelloOthers {
    public static void main(String[] args) {
        // Greet 3 of your classmates with this program, in three separate lines
        // like:
        //
        // Hello, Esther!
        // Hello, Mary!
        // Hello, Joe!
        System.out.println("Hello, Melinda!");
        System.out.println("Hello, Sara!");
        System.out.println("Hello, DD!");
    }
}

class IntroduceYourself {
    public static void main(String[] args) {
        // Write a program that prints a few details to the terminal window about you
        // It should print each detail to a new line.
        //  - Your name
        //  - Your age
        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87
        System.out.println("Andreea Josan");
        System.out.println(33);
        System.out.println(1.69);

    }
}

class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13

        // Print the result of 13 added to 22
        System.out.println(13+22);

        // Print the result of 13 substracted from 22
        System.out.println(22-13);

        // Print the result of 22 multiplied by 13
        System.out.println(22*13);

        // Print the result of 22 divided by 13 (as a decimal fraction)
        System.out.println(22.00/13.00);

        // Print the integer part of 22 divided by 13
        System.out.println(22 /13);

        // Print the reminder of 22 divided by 13
        System.out.println(22%13);

    }
}

class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        System.out.println("The average hours spent with coding in a semester are: " + (6*5*17));
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println("The percentage of hours spent with coding in a semester are: " + (30.0/52*100));
    }
}

class FavoriteNumber {
    public static void main(String[] args) {
        int favorite_number = 5;
        // Store your favorite number in a variable (as a number)
        // And print it like this: "My favorite number is: 8)
        System.out.println("My favorite number is: " + favorite_number);
    }
}

class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        int c= a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}

class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        double BMI=massInKg/Math.pow(heightInM,2);

        // Print the Body mass index (BMI) based on these values
        System.out.println("The BMI index is: " + BMI);

    }
}
class DefineBasicInfo {
    public static void main(String[] args) {
        // Define several things as a variable then print their values
        // Your name as a string
        String name= "Andreea Josan";
        // Your age as an integer
        int age=33;
        // Your height in meters as a double
        double height=1.69;
        // Whether you are married or not as a boolean
        boolean maritalStatus=true;
    }
}
class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10
        a += 10;

        System.out.println(a);

        int b = 100;
        // make it smaller by 7
        b -= 7;
        System.out.println(b);

        int c = 44;
        // please double c's value
        c *= 2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e *= e*e;
        System.out.println(e);


        int f1 = 123;
        int f2 = 345;
        boolean cond1= f1>f2;
        // tell if f1 is bigger than f2 (print as a boolean)
        System.out.println("F1 is bigger than F2? " + cond1);

        int g1 = 350;
        int g2 = 200;
        boolean cond2= g2*2 > g1;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        System.out.println("Is the double of G2 bigger than G1? " + cond2);

        int h = 135798745;
        boolean cond3= h%11==0;
        // tell if it has 11 as a divisor (print as a boolean)
        System.out.println("Has h 11 as a divisor " + cond3);

        int i1 = 10;
        int i2 = 3;
        boolean cond4 = (i1 > i2*i2) && (i1 < i2*i2*i2);
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        System.out.println("i1 is higher than i2 squared and smaller than i2 cubed: " + cond4);

        int j = 1521;
        boolean cond5 = (j%3==0) || (j%5==0);
        // tell if j is dividable by 3 or 5 (print as a boolean)
        System.out.println("j is dividable by 3 or 5: "+ cond4);

        String k = "Apple";
        k = k+k+k+k;
        //fill the k variable with its cotnent 4 times

        System.out.println(k);
    }
}

class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        System.out.println("Please enter the lenght, height and width of a cuboid!");
        Scanner scanner = new Scanner(System.in);
        double lenght = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double surface=2*height*(lenght+width);
        double volume=lenght*width*height;

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: "+ volume);

    }
}

class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int secondsInDay = 60*60*24;
        int passedSeconds = currentSeconds+ currentMinutes*60+ currentHours*60*60;
        int remainingSeconds = secondsInDay - passedSeconds;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        System.out.println("The remaining seconds are:  " + remainingSeconds);

    }
}

class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Could you please enter your name?");
        Scanner scanner = new Scanner( System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}

class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Please enter the distance in km-s! ");
        Scanner scanner = new Scanner(System.in);
        int distanceKm = Integer.parseInt(scanner.nextLine());
        double distanceMiles = distanceKm*0.6213;

        System.out.println("The distance in Miles is: " + distanceMiles);
    }
}

class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        System.out.println("Please enter the total number of chickens at the farm! ");
        Scanner scanner = new Scanner(System.in);
        int chickens = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the total number of pigs at the farm! ");
        int pigs = Integer.parseInt(scanner.nextLine());
        int totalAnimalLegs = chickens*2 + pigs*4;

        System.out.println("The total legs of the animals at the farms is: " + totalAnimalLegs);
    }
}

class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        // Sum: 22, Average: 4.4

        int sum = 0;
        int index=0;

        System.out.println("Please enter five integers in a row ");
        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()){
            sum += input.nextInt();
            index ++;
        }

        double average = sum/index;

        System.out.println("Sum: " + sum + ", Average: " + average);

    }
}
