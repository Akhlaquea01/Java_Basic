import java.util.Scanner;

/**
 * A simple program that takes two names as input and prints a greeting.
 * This demonstrates basic input/output operations in Java.
 */
public class ASaysHiToB {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first name
        System.out.print("Enter the first name: ");
        String firstName = scanner.next();

        // Prompt the user to enter the second name
        System.out.print("Enter the second name: ");
        String secondName = scanner.next();

        // Print the greeting
        System.out.println(firstName + " says Hi to " + secondName);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
