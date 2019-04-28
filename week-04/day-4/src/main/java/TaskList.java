import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> tasks;
    private IOManager ioManager;


    public TaskList() {
        this.tasks = new ArrayList<>();
        this.ioManager = new IOManager("myFile.txt");
        this.readTasks();
    }

    public void removeTasks(int taskNumber) {
        tasks.remove(taskNumber);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void listTasks() {

        for (int i = 1; i <= tasks.size() ; i++) {
            System.out.println(i + " - " + tasks.get(i-1).getName());

        }
    }

    public void readTasks() {
        List<String> stringTasks = ioManager.readData();
        for (String stringTask : stringTasks) {
            String[] datas = stringTask.split(" ");
            this.tasks.add(new Task(datas[0]));
        }

    }

    private List<String> convertToStringTasks() {
        List<String> stringTasks = new ArrayList<>();
        for (Task task : tasks) {
            stringTasks.add(task.getName());

        }
        return stringTasks;
    }

    public void saveTasks() {
        List<String> stringTasks = this.convertToStringTasks();
        this.ioManager.writeDatas(stringTasks);
    }
}
