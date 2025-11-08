import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program generates a numeric stair pattern as a 2D ArrayList.
 * For a given number A, the i-th row of the pattern contains numbers from 1 to i.
 */
public class NumericStairPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();

        // --- Generate and Display the Pattern ---
        if (rows < 1) {
            System.out.println("Please enter a positive number of rows.");
        } else {
            ArrayList<ArrayList<Integer>> pattern = generatePattern(rows);
            System.out.println("\nThe numeric stair pattern is:");
            printPattern(pattern);
        }

        scanner.close();
    }

    /**
     * Generates the numeric stair pattern.
     *
     * @param a The number of rows.
     * @return The pattern as a 2D ArrayList.
     */
    public static ArrayList<ArrayList<Integer>> generatePattern(int a) {
        ArrayList<ArrayList<Integer>> pattern = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                row.add(j);
            }
            pattern.add(row);
        }
        return pattern;
    }

    /**
     * Prints a 2D ArrayList in a user-friendly format.
     *
     * @param pattern The 2D ArrayList to print.
     */
    public static void printPattern(ArrayList<ArrayList<Integer>> pattern) {
        for (ArrayList<Integer> row : pattern) {
            System.out.println(row);
        }
    }
}
