package implementcharsequence;

public class Shifter implements CharSequence{

    String string;
    int shift;

    public Shifter(String string, int shift) {
        this.string = string;
        this.shift = shift;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index + shift);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
