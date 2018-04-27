import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        System.out.println("I've tried to copy the file. Was it successful?" + copyFile("my-file.txt", "afile.txt"));
    }

    public static boolean copyFile(String filename1, String filename2) {
        boolean test;
        Path fileToCopy = Paths.get(filename1);
        Path destinationFile = Paths.get(filename2);
        try {
            Files.copy(fileToCopy, destinationFile, StandardCopyOption.REPLACE_EXISTING);
            test = true;
        } catch (IOException e) {
            test = false;
        }

        return test;
    }
}