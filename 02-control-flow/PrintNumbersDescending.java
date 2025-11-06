import java.util.Scanner;

/**
 * This program prints all natural numbers in descending order from a given
 * starting point (N) down to 1.
 * It demonstrates the use of a while loop for countdown operations.
 */
public class PrintNumbersDescending {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the starting number.
        System.out.print("Enter a positive integer to start counting down from: ");
        int startingNumber = scanner.nextInt();

        // Check if the input is a positive number.
        if (startingNumber < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Counting down from " + startingNumber + " to 1:");

            // Use a while loop to print numbers in descending order.
            int currentNumber = startingNumber;
            while (currentNumber >= 1) {
                System.out.print(currentNumber + " ");
                currentNumber--; // Decrement the number in each iteration.
            }
            System.out.println(); // Add a newline for better formatting.
        }

        scanner.close();
    }
}
