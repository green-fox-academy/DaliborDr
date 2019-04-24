package implementcharsequence;

public class Main {
    public static void main(String[] args) {
        Gnirts something = new Gnirts("example");
        System.out.println(something.charAt(1));
        System.out.println(something.length());
        System.out.println(something.subSequence(1,3));

        Shifter shifter = new Shifter("example",2);
        System.out.println(shifter.charAt(0));
    }
}
