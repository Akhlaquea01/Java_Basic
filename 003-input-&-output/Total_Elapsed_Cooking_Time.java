import java.util.Scanner;

/**
 * Calculates the total elapsed cooking time for a lasagna recipe.
 * Demonstrates input handling, arithmetic operations, and output in Java.
 * 
 * Preparation time per layer: 2 minutes.
 * Total time = (number of layers * 2) + minutes already baked.
 * 
 * Input:
 *   First line: integer N (number of layers)
 *   Second line: integer M (minutes already baked)
 * 
 * Output:
 *   Total elapsed cooking time in minutes.
 */
public class Total_Elapsed_Cooking_Time {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Read number of layers
        System.out.print("Enter number of layers: ");
        int N = scn.nextInt();

        // Read minutes already baked
        System.out.print("Enter minutes already baked: ");
        int M = scn.nextInt();

        // Calculate total elapsed cooking time
        int totalTime = (2 * N) + M;

        // Output the result
        System.out.println("Total elapsed cooking time: " + totalTime + " minutes");

        scn.close();
    }
}