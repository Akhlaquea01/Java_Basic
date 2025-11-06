import java.util.Scanner;

/**
 * This program generates and prints the multiplication table for a given number
 * up to a specified range.
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        System.out.print("Enter the range (e.g., up to 10): ");
        int range = scanner.nextInt();

        // --- Generate and Print the Table ---
        if (range < 1) {
            System.out.println("The range must be a positive integer.");
        } else {
            System.out.println("\n--- Multiplication Table for " + number + " ---");
            for (int i = 1; i <= range; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

        scanner.close();
    }
}
