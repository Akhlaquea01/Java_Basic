import java.util.Scanner;

/**
 * This program calculates the sum of the main diagonal elements of a square matrix.
 */
public class MainDiagonalSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Matrix Dimensions ---
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        // --- Read Matrix from User ---
        int[][] matrix = readMatrix(scanner, size, size);

        // --- Calculate and Display the Sum ---
        int sum = calculateMainDiagonalSum(matrix);
        System.out.println("\nThe sum of the main diagonal elements is: " + sum);

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
     * Calculates the sum of the main diagonal elements of a square matrix.
     *
     * @param matrix The input square matrix.
     * @return The sum of the main diagonal elements.
     */
    public static int calculateMainDiagonalSum(final int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // The main diagonal consists of elements where the row index equals the column index (matrix[i][i]).
            sum += matrix[i][i];
        }
        return sum;
    }
}
