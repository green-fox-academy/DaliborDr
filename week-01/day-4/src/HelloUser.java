import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name!");
        String userName = scanner.nextLine();

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        System.out.println("Hello " + userName);
    }
}
