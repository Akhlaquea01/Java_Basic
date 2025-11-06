import java.util.Scanner;

/**
 * This program prints all perfect squares less than or equal to a given number.
 * A perfect square is an integer that is the square of another integer.
 */
public class PrintPerfectSquares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a positive integer as the upper limit: ");
        int limit = scanner.nextInt();

        // --- Print Perfect Squares ---
        if (limit < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Perfect squares up to " + limit + ":");

            // We can find all perfect squares up to the limit by squaring numbers
            // starting from 1, as long as their square is not greater than the limit.
            for (int i = 1; i * i <= limit; i++) {
                System.out.print(i * i + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
