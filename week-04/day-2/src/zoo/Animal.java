package zoo;

public abstract class Animal {
    public String name;
    protected int age;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String breed();
}
