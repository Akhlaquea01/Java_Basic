import java.util.Scanner;

/**
 * This program calculates the average of a fixed number of integers entered by the user.
 * It demonstrates the use of loops for input and basic arithmetic operations.
 */
public class AverageOfFiveNumbers {

    // Define a constant for the number of inputs to easily change it later.
    private static final int COUNT_OF_NUMBERS = 5;

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Initialize sum to 0. This variable will store the sum of the numbers.
        double sum = 0;

        // Prompt the user to enter the numbers.
        System.out.println("Please enter " + COUNT_OF_NUMBERS + " numbers:");

        // Loop to read the numbers from the user.
        for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            // Add the entered number to the sum.
            sum += scanner.nextInt();
        }

        // Calculate the average.
        double average = sum / COUNT_OF_NUMBERS;

        // Print the result, formatted to two decimal places.
        System.out.printf("The average of the numbers is: %.2f%n", average);

        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}
