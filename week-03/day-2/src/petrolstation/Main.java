package petrolstation;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car(0,100);
        Station shell = new Station();
        shell.gasAmount=1500;
        shell.refill(honda);
        System.out.println(honda.gasAmount);
        System.out.println(shell.gasAmount);

    }
}
