import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        //Write a program that reads a number from the standard input, then draws a
        // square. The square should have as many lines as the number was
        System.out.println("Please enter a number!");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String row = "";

        for (int i = 0; i<number ; i++){
            if ((i == 0) || (i == number-1)){
                for (int j=0; j< number; j++){
                    row +="%";
                }
                System.out.println(row);
                row="";
            }
            else{
                for (int j=0; j<number; j++) {
                    if ((j ==0 ) || (j == number-1)) {
                        row += "%";
                    }
                    else{
                        row += " ";
                    }
                }
                System.out.println(row);
                row="";
            }
        }
    }
}
