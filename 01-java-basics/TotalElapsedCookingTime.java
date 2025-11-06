import java.util.Scanner;

/**
 * This program calculates the total elapsed cooking time for a lasagna,
 * including preparation and baking time.
 * It demonstrates the use of constants, user input, and basic arithmetic.
 */
public class TotalElapsedCookingTime {

    // A constant for the preparation time per layer in minutes.
    public static final int PREPARATION_TIME_PER_LAYER = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Input from User ---
        System.out.print("Enter the number of layers in the lasagna: ");
        int numberOfLayers = scanner.nextInt();

        System.out.print("Enter the number of minutes the lasagna has already been in the oven: ");
        int bakeTimeSoFar = scanner.nextInt();

        // --- Calculate Times ---
        // Calculate the total preparation time.
        int preparationTime = numberOfLayers * PREPARATION_TIME_PER_LAYER;

        // Calculate the total elapsed cooking time.
        int totalElapsedTime = preparationTime + bakeTimeSoFar;

        // --- Display the Result ---
        System.out.println("\n--- Cooking Time Summary ---");
        System.out.println("Preparation Time: " + preparationTime + " minutes");
        System.out.println("Bake Time So Far: " + bakeTimeSoFar + " minutes");
        System.out.println("Total Elapsed Cooking Time: " + totalElapsedTime + " minutes");

        scanner.close();
    }
}
