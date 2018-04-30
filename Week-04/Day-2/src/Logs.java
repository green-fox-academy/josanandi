import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.
        ArrayList<String> eachLines = new ArrayList<>();

        try {
            eachLines = readingFile("log.txt");
            //System.out.println(ratioOfGetPost("log.txt"));
        } catch (IOException e) {
            System.out.println("Cannot read file");
        }
        System.out.println(uniqueIpAdresses(eachLines));
        System.out.println();
        System.out.println("The GET/POST ratio is: " + ratioGetPost(eachLines));

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

    public static ArrayList<String> uniqueIpAdresses(ArrayList<String> eachLine) {
        ArrayList<String> ipAdresses = new ArrayList<>();
        for (String line : eachLine) {
            String[] oneLine = line.split(" ");
            if (!ipAdresses.contains(oneLine[8])) {
                ipAdresses.add(oneLine[8]);
            }
        }
        Collections.sort(ipAdresses);
        return ipAdresses;
    }

    public static double ratioGetPost(ArrayList<String> eachLine) {
        ArrayList<String> ipAdresses = new ArrayList<>();
        double GetCounter = 0.0;
        double PostCounter = 0.0;
        for (String line : eachLine) {
            String[] oneLine = line.split(" ");

            if (oneLine[11].equals("GET")) {
                GetCounter ++;
            }
            else{
                PostCounter ++;
            }
        }
        double ratio = GetCounter/PostCounter;

        return ratio;

    }
}