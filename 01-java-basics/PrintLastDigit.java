import java.util.Scanner;

/**
 * This program prompts the user to enter an integer and then prints its last digit.
 * It demonstrates the use of the modulo operator (%) to extract digits.
 */
public class PrintLastDigit {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter an integer: ");

        // Read the integer from the user.
        int number = scanner.nextInt();

        // Calculate the last digit using the modulo operator.
        // The result of number % 10 is the remainder when number is divided by 10,
        // which is always the last digit.
        // We use Math.abs() to handle negative numbers correctly (e.g., -123 % 10 = -3).
        int lastDigit = Math.abs(number % 10);

        // Print the result.
        System.out.println("The last digit of " + number + " is: " + lastDigit);

        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}
