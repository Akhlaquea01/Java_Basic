import java.util.Scanner;

/**
 * This program checks if a given number is a perfect number.
 * A perfect number is a positive integer that is equal to the sum of its proper
 * positive divisors (excluding the number itself).
 */
public class PerfectNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Handle Multiple Test Cases ---
        System.out.print("How many numbers do you want to check? ");
        int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {
            System.out.print("\nEnter number #" + i + ": ");
            int number = scanner.nextInt();

            if (isPerfect(number)) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        }

        scanner.close();
    }

    /**
     * Checks if a given number is a perfect number.
     *
     * @param n The positive integer to check.
     * @return True if the number is perfect, false otherwise.
     */
    public static boolean isPerfect(int n) {
        // A perfect number must be a positive integer.
        if (n <= 1) {
            return false;
        }

        int sumOfDivisors = 1; // Start with 1 as all numbers are divisible by 1.

        // Find the sum of proper divisors. We only need to loop up to the square root of n.
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
                // If 'i' is not the square root of 'n', then 'n/i' is another divisor.
                if (i * i != n) {
                    sumOfDivisors += n / i;
                }
            }
        }

        // A number is perfect if the sum of its proper divisors is equal to the number itself.
        return sumOfDivisors == n;
    }
}
