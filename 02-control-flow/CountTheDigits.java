import java.util.Scanner;

/**
 * This program counts the number of digits in one or more integers.
 * It demonstrates how to handle multiple test cases and uses a simple
 * while loop to count the digits of each number.
 */
public class CountTheDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Handle Multiple Test Cases ---
        System.out.print("How many numbers do you want to process? ");
        int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {
            System.out.print("\nEnter number #" + i + ": ");
            int number = scanner.nextInt();
            int digitCount = countDigits(number);
            System.out.println("The number of digits in " + number + " is: " + digitCount);
        }

        scanner.close();
    }

    /**
     * Counts the number of digits in a given integer.
     *
     * @param n The integer to count the digits of.
     * @return The number of digits.
     */
    public static int countDigits(int n) {
        // A single-digit number (including 0) has 1 digit.
        if (n == 0) {
            return 1;
        }

        int count = 0;
        // Use the absolute value to handle negative numbers correctly.
        long tempNumber = Math.abs((long) n);

        // Loop until the number becomes 0.
        while (tempNumber > 0) {
            // Integer division by 10 removes the last digit.
            tempNumber /= 10;
            count++;
        }
        return count;
    }
}
