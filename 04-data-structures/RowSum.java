import java.util.Arrays;
import java.util.Scanner;

/**
 * This program calculates the sum of each row in a 2D array (matrix).
 */
public class RowSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Matrix Dimensions ---
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // --- Read Matrix from User ---
        int[][] matrix = readMatrix(scanner, rows, cols);

        // --- Calculate and Display Row Sums ---
        int[] rowSums = calculateRowSums(matrix);
        System.out.println("\nThe sum of each row is: " + Arrays.toString(rowSums));

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
     * Calculates the sum of each row in a 2D array.
     *
     * @param matrix The input 2D array.
     * @return An array containing the sum of each row.
     */
    public static int[] calculateRowSums(int[][] matrix) {
        int[] sums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            sums[i] = sum;
        }
        return sums;
    }
}
