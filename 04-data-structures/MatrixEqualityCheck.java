import java.util.Scanner;

/**
 * This program checks if two matrices of the same size are equal.
 * It demonstrates how to work with 2D arrays to represent matrices.
 */
public class MatrixEqualityCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Matrix Dimensions ---
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // --- Read Matrices from User ---
        System.out.println("\nEnter the elements of the first matrix:");
        int[][] matrixA = readMatrix(scanner, rows, cols);

        System.out.println("\nEnter the elements of the second matrix:");
        int[][] matrixB = readMatrix(scanner, rows, cols);

        // --- Check for Equality and Display Result ---
        if (areMatricesEqual(matrixA, matrixB)) {
            System.out.println("\nThe two matrices are equal.");
        } else {
            System.out.println("\nThe two matrices are not equal.");
        }

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
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    /**
     * Checks if two matrices are equal.
     *
     * @param a The first matrix.
     * @param b The second matrix.
     * @return True if the matrices are equal, false otherwise.
     */
    public static boolean areMatricesEqual(int[][] a, int[][] b) {
        // First, check if the dimensions are the same.
        if (a.length != b.length || a[0].length != b[0].length) {
            return false;
        }

        // Then, check each element.
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false; // If any element is different, the matrices are not equal.
                }
            }
        }
        return true; // If all elements are the same, the matrices are equal.
    }
}
