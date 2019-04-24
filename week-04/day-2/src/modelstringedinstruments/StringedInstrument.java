package modelstringedinstruments;

public abstract class StringedInstrument extends Instruments {

    protected int numberOfStrings;

//    public StringedInstrument(int numberOfStrings) {
//        this.numberOfStrings = numberOfStrings;
//    }

    protected abstract String sound();

}
