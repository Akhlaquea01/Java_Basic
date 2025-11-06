import java.util.Scanner;

/**
 * This program calculates the remaining bake time for a lasagna.
 * It demonstrates the use of constants and basic arithmetic operations.
 */
public class RemainingBakeTime {

    // A constant for the recommended bake time in minutes.
    // Using a constant makes the code easier to read and modify.
    public static final int EXPECTED_BAKE_TIME = 40;

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input.
        System.out.print("How many minutes has the lasagna been in the oven? ");
        int actualBakeTime = scanner.nextInt();

        // Calculate the remaining bake time.
        int remainingTime = EXPECTED_BAKE_TIME - actualBakeTime;

        // Provide a descriptive output based on the remaining time.
        if (remainingTime > 0) {
            System.out.println("The lasagna still needs to bake for " + remainingTime + " more minutes.");
        } else if (remainingTime == 0) {
            System.out.println("The lasagna is ready! Take it out of the oven.");
        } else {
            System.out.println("The lasagna has been in the oven for too long. It might be overcooked!");
        }


        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}
