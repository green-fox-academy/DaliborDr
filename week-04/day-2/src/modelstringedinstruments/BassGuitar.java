package modelstringedinstruments;

public class BassGuitar extends StringedInstrument {
    public BassGuitar() {
        this.name = "Bass Guitar";
        this.numberOfStrings = 4;
    }

    public BassGuitar(int numberOFStrings) {
        this.numberOfStrings = numberOFStrings;
        this.name = "Bass Guitar";
    }

    @Override
    protected String sound() {
        return "Duum-duum-duum";

    }

    @Override
    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());

    }
}
