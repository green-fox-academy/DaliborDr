import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
public class CountLines {
    public static void main(String[] args) {

        System.out.println(numberOfLines("day-1.iml"));

    }

    public static int numberOfLines(String fileName) {
        Path filePath = Paths.get(fileName);
        int a = 0;
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String words : lines) {
                a++;
                System.out.println(words);

            }


        } catch (IOException e) {
            return 0;
        }
        return a;


    }
}
