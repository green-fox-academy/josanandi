import javax.sound.sampled.Line;
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

class OddEven{
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        System.out.println("Could you please enter a number");
        Scanner scanner = new Scanner( System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number%2 == 0 ){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}

class OneTwoALot{
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot

        System.out.println("Could you please enter a number");
        Scanner scanner = new Scanner( System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number <= 0 ){
            System.out.println("Not enough");
        }
        else if( number == 1){
            System.out.println("One");
        }
        else if( number == 2){
            System.out.println("Two");
        }
        else if( number > 2){
            System.out.println("A lot");
        }
    }
}

class PrintBigger{
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        System.out.println("Could you please enter a number");
        Scanner scanner = new Scanner( System.in);
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Could you please enter another number");
        int b = Integer.parseInt(scanner.nextLine());

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

class PartyIndicator{
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        System.out.println("Could you please enter the number of girls at the party");
        Scanner scanner = new Scanner( System.in);
        int girls = Integer.parseInt(scanner.nextLine());

        System.out.println("Could you please enter the number of boys at the party");
        int boys = Integer.parseInt(scanner.nextLine());
        int totalParticipants = girls + boys;

        if ((girls == boys) & (totalParticipants >= 20)){
            System.out.println("The party is excellent!");
        }

        else if( girls == 0) {
            System.out.println("Sausage party");
        }

        else if ((girls != boys) & (totalParticipants >= 20)) {
            System.out.println("Quite cool party!");
        }

        else if (totalParticipants <20){
            System.out.println("Average party...");
        }
    }
}

class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        // if a is even increment out by one

        if(a % 2 == 0){
            out++;
        }
        System.out.println(out);

        int b = 13;
        String out2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"
        if (10 <= b  &&  b  <= 20){
            out2 = "Sweet!";
        }
        else if (b < 10){
            out2 = "Less!";
        }
        else{
            out2 = "More!";
        }
        System.out.println(out2);


        int c = 123;
        int credits = 48;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same

        if ( !isBonus){
            if (credits >= 50){
                c -= 2;
            }
            else{
                c--;
            }
        }
        System.out.println(c);


        int d = 8;
        int time = 120;
        String out3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"

        if ( d % 4 == 0) {
            if (time <= 200) {
                out3 = "check";
            } else {
                out3 = "Time out";
            }
        }
        else{
            out3 = "Run Forest Run!";
        }

        System.out.println(out3);
    }
}

class IWontCheatOnTheExams {
    public static void main(String[] args) {
        // Create a program that writes this line 100 times:
        // "I won't cheat on the exam!"
        for (int i = 0; i < 100; i++) {
            System.out.println("I won't cheat on the exam!");
        }
    }
}

class PrintEven {
    public static void main(String[] args) {
        // Create a program that prints all the even numbers between 0 and 500
        for (int i = 0; i <= 500; i += 2) {
            System.out.println(i);
        }
    }
}

class MultiplicationTable    {
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

class CountFromTo    {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one

        System.out.println("Please enter 2 numbers!");
        Scanner input = new Scanner(System.in);
        int a =Integer.parseInt(input.nextLine());
        int b =Integer.parseInt(input.nextLine());

        if (a > b){
            System.out.println("The second number should be greater");
        }
        else{
            
            for ( int i=b; i <=  a; i ++ ) {
                System.out.println(i);
            }
        }

    }
}

