import java.util.Scanner;

/**
 * This program checks if a given number is a prime number.
 * A prime number is a natural number greater than 1 that has no positive divisors
 * other than 1 and itself.
 */
public class PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a positive integer to check if it's prime: ");
        int number = scanner.nextInt();

        // --- Check and Display Result ---
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    /**
     * Checks if a given number is a prime number using an efficient method.
     *
     * @param n The positive integer to check.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        // Prime numbers must be greater than 1.
        if (n <= 1) {
            return false;
        }

        // We only need to check for divisors up to the square root of the number.
        // If a number 'n' has a divisor larger than its square root, it must also
        // have a divisor smaller than its square root.
        for (int i = 2; i * i <= n; i++) {
            // If 'n' is divisible by any number other than 1 and itself, it's not prime.
            if (n % i == 0) {
                return false;
            }
        }

        // If no divisors are found, the number is prime.
        return true;
    }
}
