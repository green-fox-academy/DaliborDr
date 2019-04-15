import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
public class CopyFile {
    public static void main(String[] args) {

        System.out.print(copy("my-file.txt","new-file.txt"));

    }

    public static boolean copy(String fileName1, String fileName2) {
        Path filePath1 = Paths.get(fileName1);
        Path filePath2 = Paths.get(fileName2);

        try {
            List<String> content = Files.readAllLines(filePath2);
            Files.write(filePath1, content);
            return true;

        } catch (IOException e) {
            System.out.println("Can't copy the file content...");
            return false;
        }


    }
}
