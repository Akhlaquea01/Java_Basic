import java.util.Scanner;

/**
 * This program calculates the power of a number (base raised to an exponent).
 * It demonstrates how to implement this calculation using a loop and also shows
 * the alternative of using the built-in Math.pow() method.
 */
public class PowerCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // --- Calculate Power Using a Loop ---
        long resultFromLoop = power(base, exponent);
        System.out.println("\n" + base + " raised to the power of " + exponent + " (calculated with a loop) is: " + resultFromLoop);

        // --- Calculate Power Using Math.pow() ---
        double resultFromMathPow = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " (calculated with Math.pow()) is: " + resultFromMathPow);

        scanner.close();
    }

    /**
     * Calculates the power of a base raised to an exponent using a loop.
     *
     * @param base     The base number.
     * @param exponent The exponent.
     * @return The result of the power calculation.
     */
    public static long power(int base, int exponent) {
        // Anything raised to the power of 0 is 1.
        if (exponent == 0) {
            return 1;
        }

        long result = 1;
        // Loop 'exponent' times, multiplying the base with the result each time.
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
