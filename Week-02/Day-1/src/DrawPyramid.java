import java.util.Scanner;

public class DrawPyramid {
    public static void main (String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid. The pyramid should have as many lines as the number was
        System.out.println("Please enter a number!");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String row = "";

        for (int i=0; i< number; i++){
            for(int j=0; j <=(2*number-1); j++){
                if ((j < number-i-1) || (j > number +i-1)) {
                    row += " ";
                }
                else{
                    row += "*";
                }
            }
            System.out.println(row);
            row="";
        }

    }
}
