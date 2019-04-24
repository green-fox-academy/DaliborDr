package modelstringedinstruments;

public class Violin extends StringedInstrument {
    public Violin() {
        this.name = "Violin";
        this.numberOfStrings = 4;
    }

    public Violin(int numberOFStrings) {
        this.numberOfStrings = numberOFStrings;
        this.name = "Violin";
    }

    @Override
    protected String sound() {
        return "Screech";

    }

    @Override
    public void play() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());

    }
}
