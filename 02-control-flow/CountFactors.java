import java.util.Scanner;

/**
 * This program counts the total number of factors for a given integer.
 * It demonstrates an efficient method for counting factors using a loop
 * that runs up to the square root of the number.
 */
public class CountFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer.
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorCount = countFactors(number);
            System.out.println("The number of factors for " + number + " is: " + factorCount);
        }

        scanner.close();
    }

    /**
     * Counts the factors of a given positive integer.
     *
     * @param n The positive integer.
     * @return The total count of factors.
     */
    public static int countFactors(int n) {
        if (n == 1) {
            return 1;
        }

        int count = 0;
        // Loop from 1 up to the square root of the number.
        for (int i = 1; i * i <= n; i++) {
            // If 'i' is a factor of 'n'.
            if (n % i == 0) {
                // If 'i' and 'n/i' are the same, we count it as one factor (e.g., for perfect squares).
                if (i * i == n) {
                    count++;
                } else {
                    // Otherwise, 'i' and 'n/i' are two distinct factors.
                    count += 2;
                }
            }
        }
        return count;
    }
}
