import java.util.Scanner;

/**
 * This program solves the classic FizzBuzz problem.
 * It demonstrates the use of if-else if-else statements with the modulo operator (%)
 * and the logical AND operator (&&).
 */
public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // --- FizzBuzz Logic ---
        // The order of these conditions is important. We must check for divisibility by both 3 and 5 first.
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

        scanner.close();
    }
}
