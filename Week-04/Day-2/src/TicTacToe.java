import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.

        System.out.println(ticTacResult("win-o.txt"));
        // should print O

        System.out.println(ticTacResult("win-x.txt"));
        // should print X

        System.out.println(ticTacResult("draw.txt"));
        // should print draw
    }

    public static String ticTacResult(String fileName) {
        Path file = Paths.get(fileName);
        List<String> readValues = null;
        Character[][] table = new Character[3][3];
        String mainResult = "";
        boolean condition = true;

        try {
            readValues = Files.readAllLines(file);
        } catch (IOException e) {
            System.out.println("Unable to read the file!");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = (readValues.get(i)).charAt(j);
            }
        }

        for (int i = 0; i < 3; i++) {
            if ((table[i][0] == table[i][1]) && (table[i][0] == table[i][2])) {
                condition = false;
                mainResult = Character.toString(table[i][0]);
                break;
            }
        }


        for (int i = 0; i < 3; i++) {
            if (table[0][i] == table[1][i] && table[0][i] == table[2][i]) {
                condition = false;
                mainResult = Character.toString(table[0][i]);
                break;
            }
        }

        boolean testDiagonal = (table[0][0] == table[1][1]) && (table[0][0] == table[2][2]);
        boolean testDiagonal2 = (table[0][2] == table[1][1]) && (table[0][2] == table[2][0]);

        if (testDiagonal || testDiagonal2) {
            condition = false;
            mainResult = Character.toString(table[1][1]);
        }


        if (condition == true) {
            mainResult = "draw";}

            return mainResult;



    }
}


