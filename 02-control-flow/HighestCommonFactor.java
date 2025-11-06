import java.util.Scanner;

/**
 * This program calculates the Highest Common Factor (HCF) or Greatest Common Divisor (GCD)
 * of two integers using the efficient Euclidean algorithm.
 */
public class HighestCommonFactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        // --- Calculate and Display HCF ---
        if (num1 > 0 && num2 > 0) {
            int hcf = calculateHCF(num1, num2);
            System.out.println("The HCF (or GCD) of " + num1 + " and " + num2 + " is: " + hcf);
        } else {
            System.out.println("Please enter positive integers.");
        }

        scanner.close();
    }

    /**
     * Calculates the HCF of two positive integers using the Euclidean algorithm.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The HCF of the two integers.
     */
    public static int calculateHCF(int a, int b) {
        // The Euclidean algorithm is based on the principle that the greatest common
        // divisor of two numbers does not change if the larger number is replaced by
        // its difference with the smaller number. This process is repeated until the
        // two numbers become equal.
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
