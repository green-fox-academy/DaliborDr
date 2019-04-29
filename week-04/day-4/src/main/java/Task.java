public class Task {
    private String name;
    private boolean completed = false;
    private String status = "[ ] ";
    private String status2 = "[x] ";

    public String setStatus() {
        if (completed) {
            return status2;
        } else {
            return status;
        }
    }

    public boolean getStatus() {
        return this.completed;
    }

    public boolean complete() {
       return this.completed = true;
    }

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
