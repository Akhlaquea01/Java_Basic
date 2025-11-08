import java.util.Scanner;

/**
 * This program prints the elements of a 2D array in a row-wise wave pattern.
 */
public class WavePrintRowWise {

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
        System.out.println("\nThe matrix printed in a row-wise wave pattern is:");
        printWaveRowWise(matrix);

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
     * Prints a 2D array in a row-wise wave pattern.
     *
     * @param matrix The 2D array to print.
     */
    public static void printWaveRowWise(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            // If the row index is even, print the row from left to right.
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            // If the row index is odd, print the row from right to left.
            else {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
