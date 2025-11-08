import java.util.Scanner;

/**
 * This program prints all natural numbers in ascending order from 1 up to a given limit (N).
 * It demonstrates the use of a while loop for counting operations.
 */
public class PrintNumbersAscending {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the upper limit.
        System.out.print("Enter a positive integer as the upper limit: ");
        int limit = scanner.nextInt();

        // Check if the input is a positive number.
        if (limit < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Counting from 1 to " + limit + ":");

            // Use a while loop to print numbers in ascending order.
            int currentNumber = 1;
            while (currentNumber <= limit) {
                System.out.print(currentNumber + " ");
                currentNumber++; // Increment the number in each iteration.
            }
            System.out.println(); // Add a newline for better formatting.
        }

        scanner.close();
    }
}
