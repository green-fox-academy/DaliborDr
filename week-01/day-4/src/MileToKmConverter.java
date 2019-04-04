import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner newScanner = new Scanner(System.in);
        int userInput = newScanner.nextInt();
        System.out.println(userInput * 0.621371192);

    }
}
