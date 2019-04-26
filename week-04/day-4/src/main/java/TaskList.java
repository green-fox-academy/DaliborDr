import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> tasks;
    private IOManager ioManager;

    public TaskList() {
        this.tasks = new ArrayList<>();
        this.ioManager = new IOManager("myFile.txt");
    }
}
