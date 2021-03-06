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

        for (int i = 1; i <= tasks.size(); i++) {
            if (tasks.get(i - 1).getStatus()) {
                System.out.println(i + " - " + tasks.get(i - 1).setStatus() + tasks.get(i - 1).getName());
            } else {
                System.out.println(i + " - " + tasks.get(i - 1).setStatus() + tasks.get(i - 1).getName());
            }
        }
    }

    public void changeStatus(int taskNum) {
        tasks.get(taskNum).complete();
    }

    public void readTasks() {
        List<String> stringTasks = ioManager.readData();
        for (String stringTask : stringTasks) {
            String[] datas = stringTask.split("  ");
            boolean taskIsDone = datas[0].equals("[x]") ? true : false;
            Task task = new Task(datas[1]);
            if (taskIsDone) {
                task.complete();
            }
            this.tasks.add(task);
        }
    }

    private List<String> convertToStringTasks() {
        List<String> stringTasks = new ArrayList<>();
        for (Task task : tasks) {
            String taskStatus = task.setStatus();
            String taskName = task.getName();
            stringTasks.add(taskStatus + "  " + taskName);
        }
        return stringTasks;
    }

    public void saveTasks() {
        List<String> stringTasks = this.convertToStringTasks();
        this.ioManager.writeDatas(stringTasks);
    }
}
