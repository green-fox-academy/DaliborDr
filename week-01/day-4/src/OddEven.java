import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int userInput = newScanner.nextInt();
        if (userInput %2 == 0) {
            System.out.println("even");

        }
        else {
            System.out.println("odd");
        }
    }
}
