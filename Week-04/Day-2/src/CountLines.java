import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main (String[] args) throws IOException {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        System.out.println(returnLines("mytext.txt"));
    }
    public static int returnLines(String fileName) throws IOException {
        int counter = 0;
        try{

        Path fileToRead = Paths.get(fileName);
        Files.readAllLines(fileToRead);
        List<String> lines = Files.readAllLines(fileToRead);

        for (String line:lines) {
            counter++;
        }
        }
        catch (NoSuchFileException e) {
            System.out.println(0);
        }
        return counter;
    }
}
