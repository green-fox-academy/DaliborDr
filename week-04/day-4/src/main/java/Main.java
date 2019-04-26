public class Main {
    public static void main(String[] args) {

    Commands cmm = new Commands();
    TaskList tasks = new TaskList();
    boolean isRunning = true;


    while (isRunning) {

        String nextCommand = cmm.getNextCommand();

        if (nextCommand.equals("l")) {
        tasks.listTasks();
        }

        if (nextCommand.equals("a")) {
            Task newTask = cmm.createTask();
            tasks.addTask(newTask);
        }

        if (nextCommand.equals("r")) {
            //this is about to delete a task

        }

        if (nextCommand.equals("c")) {
        //It should make the task completed

        }

        if (nextCommand.equals("q")) {
            tasks.saveTasks();
            isRunning = false;
        }

    }

    }
}
