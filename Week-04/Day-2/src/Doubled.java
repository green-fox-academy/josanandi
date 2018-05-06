import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        ArrayList<String> eachLines = new ArrayList<>();

        try {
            eachLines = readingFile("duplicated-chars.txt");
            //System.out.println(ratioOfGetPost("log.txt"));
        } catch (IOException e) {
            System.out.println("Cannot read file");
        }
        System.out.println(decryptDouble(eachLines));
        System.out.println();

    }

    public static ArrayList<String> readingFile(String fileName) throws IOException {
        Path file = Paths.get(fileName);
        List<String> lines = Files.readAllLines(file);
        ArrayList<String> eachLine = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            eachLine.add(lines.get(i));
        }
        return eachLine;
    }

    public static ArrayList<String> decryptDouble(ArrayList<String> eachLine) {
        ArrayList<String> doubledLines = new ArrayList<>();
        for (String line : eachLine) {
            String[] oneLine = line.split(" ");
            for (int i = 0; i < oneLine.length; i++) {
                doubledLines.add(oneLine[i]);
            }
        }

        return doubledLines;
    }
}
