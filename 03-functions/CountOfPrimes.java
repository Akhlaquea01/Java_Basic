import java.util.Arrays;
import java.util.Scanner;

/**
 * This program counts the number of prime numbers up to a given limit (n).
 * It uses the Sieve of Eratosthenes algorithm, which is an efficient method for finding all prime numbers up to a specified integer.
 */
public class CountOfPrimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a positive integer as the upper limit: ");
        int limit = scanner.nextInt();

        // --- Count Primes and Display Result ---
        if (limit < 2) {
            System.out.println("There are no prime numbers up to " + limit);
        } else {
            int primeCount = sieveOfEratosthenes(limit);
            System.out.println("The number of prime numbers up to " + limit + " is: " + primeCount);
        }

        scanner.close();
    }

    /**
     * Counts the number of primes up to a given limit using the Sieve of Eratosthenes.
     *
     * @param n The upper limit.
     * @return The count of prime numbers.
     */
    public static int sieveOfEratosthenes(int n) {
        // Create a boolean array "isPrime" and initialize all entries it as true.
        // A value in isPrime[i] will finally be false if i is Not a prime, else true.
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime numbers.
        isPrime[0] = false;
        isPrime[1] = false;

        // Start from the first prime number, 2.
        for (int p = 2; p * p <= n; p++) {
            // If isPrime[p] is not changed, then it is a prime.
            if (isPrime[p]) {
                // Update all multiples of p.
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Count the number of primes.
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}
