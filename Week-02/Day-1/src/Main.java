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