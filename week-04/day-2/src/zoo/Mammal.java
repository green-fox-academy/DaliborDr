package zoo;

public class Mammal extends Animal {
    public String howBreed = "pushing miniature versions out.";

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return howBreed;
    }
}
