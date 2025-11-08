import java.util.Scanner;

/**
 * This program calculates the sum of the digits of one or more integers.
 * It demonstrates how to handle multiple test cases and uses a while loop
 * to extract and sum the digits of each number.
 */
public class SumTheDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Handle Multiple Test Cases ---
        System.out.print("How many numbers do you want to process? ");
        int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {
            System.out.print("\nEnter number #" + i + ": ");
            int number = scanner.nextInt();
            int sum = sumDigits(number);
            System.out.println("The sum of the digits in " + number + " is: " + sum);
        }

        scanner.close();
    }

    /**
     * Calculates the sum of the digits of a given integer.
     *
     * @param n The integer.
     * @return The sum of the digits.
     */
    public static int sumDigits(int n) {
        int sum = 0;
        // Use the absolute value to handle negative numbers correctly.
        int number = Math.abs(n);

        // Loop until the number becomes 0.
        while (number > 0) {
            // Get the last digit.
            int digit = number % 10;
            // Add it to the sum.
            sum += digit;
            // Remove the last digit.
            number /= 10;
        }
        return sum;
    }
}
