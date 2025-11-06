import java.util.Scanner;

/**
 * This program calculates the Least Common Multiple (LCM) of two integers.
 * It uses the formula: LCM(a, b) = |a * b| / GCD(a, b)
 */
public class LeastCommonMultiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        // --- Calculate and Display LCM ---
        if (num1 > 0 && num2 > 0) {
            long lcm = calculateLCM(num1, num2);
            System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        } else {
            System.out.println("Please enter positive integers.");
        }

        scanner.close();
    }

    /**
     * Calculates the LCM of two positive integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The LCM of the two integers.
     */
    public static long calculateLCM(int a, int b) {
        // The LCM can be a large number, so we use the 'long' data type to prevent overflow.
        return ((long) a * b) / calculateGCD(a, b);
    }

    /**
     * Calculates the GCD of two positive integers using the Euclidean algorithm.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The GCD of the two integers.
     */
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
