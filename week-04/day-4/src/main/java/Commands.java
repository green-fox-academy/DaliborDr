import java.util.Scanner;

public class Commands {
    Scanner scanner;

    public Commands() {
        this.scanner = new Scanner(System.in);
    }

    public String getNextCommand() {
        System.out.println("What are you going to do");
        System.out.println("-l   Lists all the tasks");
        System.out.println("-a   Adds a new task");
        System.out.println("-r   Removes a task");
        System.out.println("-c   Completes a task");
        System.out.println("-q Quit and save changes");

        return scanner.nextLine();
    }

    public Task createTask() {
        System.out.println("Enter the name of the task");
        String name = scanner.nextLine();

        return new Task(name);
    }


    public int removeTask() {
        System.out.println("Write a num of the task you want to remove");
        int numOfProductToDelete = scanner.nextInt();

        return numOfProductToDelete ;
    }

    public int completeTask() {
        System.out.println("Write a number of a task u want to have as a completed.");
        int numOfTask = scanner.nextInt();

        return numOfTask;
    }
}
