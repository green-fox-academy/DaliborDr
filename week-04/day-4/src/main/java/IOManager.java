import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOManager {

    private Path path;

    public IOManager(String fileName) {
        this.path = Paths.get(fileName);
    }

    public List<String> readData() {
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(path);
        }
        catch (IOException e) {
            System.out.println("Your file does not exists or is corrupted\nIf it exists then please delete it :)");
        }
        return content;
    }
}
