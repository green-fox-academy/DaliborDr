package zoo;

public class Reptile extends Animal {
    public String howBreed = " laying eggs.";
    public Reptile(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return this.howBreed;
    }
}
