import java.util.Scanner;

/**
 * This program finds the first and last digits of one or more integers.
 * It demonstrates how to handle multiple test cases and uses loops and arithmetic
 * operations to extract the required digits.
 */
public class FirstAndLastDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Handle Multiple Test Cases ---
        System.out.print("How many numbers do you want to process? ");
        int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {
            System.out.print("\nEnter number #" + i + ": ");
            int number = scanner.nextInt();

            // Find and print the first and last digits.
            int firstDigit = getFirstDigit(number);
            int lastDigit = getLastDigit(number);

            System.out.println("For the number " + number + ":");
            System.out.println("  - First digit: " + firstDigit);
            System.out.println("  - Last digit: " + lastDigit);
        }

        scanner.close();
    }

    /**
     * Finds the first digit of a given integer.
     *
     * @param n The integer.
     * @return The first digit of the number.
     */
    public static int getFirstDigit(int n) {
        // Use the absolute value to handle negative numbers.
        n = Math.abs(n);
        // Repeatedly divide by 10 until only the first digit remains.
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    /**
     * Finds the last digit of a given integer.
     *
     * @param n The integer.
     * @return The last digit of the number.
     */
    public static int getLastDigit(int n) {
        // The last digit is the remainder when the number is divided by 10.
        // Use the absolute value to handle negative numbers.
        return Math.abs(n % 10);
    }
}
