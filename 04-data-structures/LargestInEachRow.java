import java.util.Arrays;
import java.util.Scanner;

/**
 * This program finds the largest element in each row of a 2D array (matrix).
 */
public class LargestInEachRow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Matrix Dimensions ---
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // --- Read Matrix from User ---
        int[][] matrix = readMatrix(scanner, rows, cols);

        // --- Find the Largest Element in Each Row ---
        int[] largestElements = findLargestInEachRow(matrix);
        System.out.println("\nThe largest element in each row is: " + Arrays.toString(largestElements));

        scanner.close();
    }

    /**
     * Reads a matrix from the user.
     *
     * @param scanner The Scanner object to read input.
     * @param rows    The number of rows in the matrix.
     * @param cols    The number of columns in the matrix.
     * @return The matrix as a 2D array.
     */
    public static int[][] readMatrix(Scanner scanner, int rows, int cols) {
        System.out.println("Enter the elements of the matrix:");
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    /**
     * Finds the largest element in each row of a 2D array.
     *
     * @param matrix The input 2D array.
     * @return An array containing the largest element of each row.
     */
    public static int[] findLargestInEachRow(int[][] matrix) {
        int[] largest = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0]; // Assume the first element is the largest.
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            largest[i] = max;
        }
        return largest;
    }
}
