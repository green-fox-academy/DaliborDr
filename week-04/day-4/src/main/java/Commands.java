import javafx.concurrent.Task;

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

        return scanner.nextLine();

    }

    public Task createTAsk() {
        System.out.println("Enter the name of the task");
        String name = scanner.nextLine();

        return new Task(name);
    }
}
