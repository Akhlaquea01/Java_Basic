import java.util.Scanner;

/**
 * This program prints the elements of a 2D array in a column-wise wave pattern.
 */
public class WavePrintColumnWise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Matrix Dimensions ---
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // --- Read Matrix from User ---
        int[][] matrix = readMatrix(scanner, rows, cols);

        // --- Print the Matrix in a Wave Pattern ---
        System.out.println("\nThe matrix printed in a column-wise wave pattern is:");
        printWaveColumnWise(matrix);

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
     * Prints a 2D array in a column-wise wave pattern.
     *
     * @param matrix The 2D array to print.
     */
    public static void printWaveColumnWise(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            // If the column index is even, print the column from top to bottom.
            if (j % 2 == 0) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            // If the column index is odd, print the column from bottom to top.
            else {
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
