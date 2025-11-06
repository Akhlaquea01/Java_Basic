import java.util.Scanner;

/**
 * This program performs matrix subtraction on two matrices of the same size.
 */
public class MatrixSubtraction {

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

        // --- Perform Subtraction and Display Result ---
        int[][] resultMatrix = subtractMatrices(matrixA, matrixB);
        System.out.println("\nThe difference of the two matrices (A - B) is:");
        printMatrix(resultMatrix);

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
     * Prints a matrix to the console.
     *
     * @param matrix The matrix to be printed.
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Subtracts the second matrix from the first.
     *
     * @param a The first matrix.
     * @param b The second matrix.
     * @return The resulting difference matrix (a - b).
     */
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }
}
