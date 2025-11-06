import java.util.Scanner;

/**
 * This program prints all odd numbers from 1 up to a given limit.
 * It demonstrates two different approaches to solving this problem.
 */
public class PrintOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a positive integer as the upper limit: ");
        int limit = scanner.nextInt();

        if (limit < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            // --- Method 1: Incrementing by 2 ---
            System.out.println("\n--- Method 1: Incrementing by 2 ---");
            System.out.println("Odd numbers from 1 to " + limit + ":");
            for (int i = 1; i <= limit; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();

            // --- Method 2: Using the Modulo Operator ---
            System.out.println("\n--- Method 2: Using the Modulo Operator ---");
            System.out.println("Odd numbers from 1 to " + limit + ":");
            for (int i = 1; i <= limit; i++) {
                // An odd number has a remainder of 1 when divided by 2.
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
