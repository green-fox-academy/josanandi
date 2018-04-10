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