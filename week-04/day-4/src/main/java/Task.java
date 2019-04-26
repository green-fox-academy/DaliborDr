public class Task {
    private String name;
    private boolean completed;


    public Task() {
        this.completed = true;
    }

    public Task(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + this.name;
    }

}
