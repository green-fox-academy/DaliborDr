package zoo;

public class Bird extends Animal {
    public String howBreed = "laying eggs.";
    public Bird(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return howBreed;
    }
}
