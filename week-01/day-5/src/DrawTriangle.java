import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String star = "*";
        int i,j;

        for (i= 0; i < size; i++){

            for (j = 0; j < size ; j++) {
                if (j<=i) {
                    System.out.print(star);
                }

            }
            System.out.println();
        }














        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was


    }
}
