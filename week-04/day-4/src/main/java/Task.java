public class Task {
    private String name;
    private boolean completed;
    

    public Task(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
