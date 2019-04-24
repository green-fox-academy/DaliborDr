package modelstringedinstruments;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.name = "Electric Guitar";
        this.numberOfStrings = 6;
    }

    public ElectricGuitar(int numberOFStrings) {
        this.numberOfStrings = numberOFStrings;
        this.name = "Electric Guitar";
    }

    @Override
    protected String sound() {
        return "Twang";

    }

    @Override
    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());

    }
}
