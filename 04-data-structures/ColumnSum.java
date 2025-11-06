import java.util.Arrays;
import java.util.Scanner;

/**
 * This program calculates the sum of each column in a 2D array (matrix).
 */
public class ColumnSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Matrix Dimensions ---
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // --- Read Matrix from User ---
        int[][] matrix = readMatrix(scanner, rows, cols);

        // --- Calculate and Display Column Sums ---
        int[] columnSums = calculateColumnSums(matrix);
        System.out.println("\nThe sum of each column is: " + Arrays.toString(columnSums));

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
     * Calculates the sum of each column in a 2D array.
     *
     * @param matrix The input 2D array.
     * @return An array containing the sum of each column.
     */
    public static int[] calculateColumnSums(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] sums = new int[cols];

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            sums[j] = sum;
        }
        return sums;
    }
}
