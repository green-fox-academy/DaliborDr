package zoo;

public abstract class Animal {
    private String name;
    protected int age;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String breed();
}
