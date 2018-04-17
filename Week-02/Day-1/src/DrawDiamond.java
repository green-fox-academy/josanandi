import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond, The diamond should have as many lines as the number was

        System.out.println("Please enter a number!");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int n = number / 2;
        String row = "";

        if (number % 2 == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= (2 * n - 1); j++) {
                    if ((j < n - i - 1) || (j > n + i - 1)) {
                        row += " ";
                    } else {
                        row += "*";
                    }
                }
                System.out.println(row);
                row = "";
            }
            for (int i = n; i > 0; i--) {
                for (int j = (2 * n - 1); j > 0; j--) {
                    if ((j <= n - i) || (j >= n + i)) {
                        row += " ";
                    } else {
                        row += "*";
                    }
                }
                System.out.println(row);
                row = "";
            }

        }
        else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= (number); j++) {
                    if ((j < n - i ) || (j > n + i )) {
                        row += " ";
                    } else {
                        row += "*";
                    }
                }
                System.out.println(row);
                row = "";
            }

            for (int i=0; i<number; i++){
                row += "*";
                }
            System.out.println(row);
            row = "";

            for (int i = n; i > 0; i--) {
                for (int j = (number); j > 0; j--) {
                    if ((j <= n- i+1) || (j >= n + i+1)) {
                        row += " ";
                    } else {
                        row += "*";
                    }
                }
                System.out.println(row);
                row = "";
            }

        }
    }
}
