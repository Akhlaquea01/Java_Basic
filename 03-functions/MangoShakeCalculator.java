import java.util.Scanner;

/**
 * This program calculates the maximum number of mango shakes that can be made
 * given a certain number of whole mangoes and extra slices.
 */
public class MangoShakeCalculator {

    // --- Constants ---
    private static final int SLICES_PER_MANGO = 3;
    private static final int SLICES_PER_SHAKE = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the number of whole mangoes: ");
        int mangoes = scanner.nextInt();

        System.out.print("Enter the number of extra mango slices: ");
        int slices = scanner.nextInt();

        // --- Calculate and Display the Result ---
        if (mangoes < 0 || slices < 0) {
            System.out.println("The number of mangoes and slices cannot be negative.");
        } else {
            int maxShakes = calculateMaxShakes(mangoes, slices);
            System.out.println("\nYou can make a maximum of " + maxShakes + " mango shakes.");
        }

        scanner.close();
    }

    /**
     * Calculates the maximum number of mango shakes.
     *
     * @param numMangoes The number of whole mangoes.
     * @param numSlices  The number of extra slices.
     * @return The maximum number of shakes that can be made.
     */
    public static int calculateMaxShakes(int numMangoes, int numSlices) {
        // Calculate the total number of slices.
        int totalSlices = (numMangoes * SLICES_PER_MANGO) + numSlices;
        // The number of shakes is the total number of slices divided by the slices needed per shake.
        // Integer division automatically handles the remainder (you can't make a partial shake).
        return totalSlices / SLICES_PER_SHAKE;
    }
}
