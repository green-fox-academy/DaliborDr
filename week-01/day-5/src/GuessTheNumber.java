import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args){
        // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
        Scanner scanner =new Scanner(System.in);
        int storedNumber=8;

        for (int i = 0; i <100000 ; i++) {
            int userInput = scanner.nextInt();

            if (userInput < storedNumber) {
                System.out.println("The stored number is higher");
            } else if (userInput > storedNumber) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number: 8");
            }
        }









    }
}
