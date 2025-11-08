import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program performs scalar multiplication on a matrix.
 * Each element of the matrix is multiplied by a given scalar value.
 */
public class MatrixScalarProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Read Matrix ---
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        ArrayList<ArrayList<Integer>> matrix = readMatrix(scanner, rows, cols);

        // --- Get Scalar Value ---
        System.out.print("\nEnter the scalar value to multiply with: ");
        int scalar = scanner.nextInt();

        // --- Perform Scalar Multiplication and Display Result ---
        ArrayList<ArrayList<Integer>> resultMatrix = scalarMultiply(matrix, scalar);
        System.out.println("\nThe resulting matrix after scalar multiplication is:");
        printMatrix(resultMatrix);

        scanner.close();
    }

    /**
     * Reads a matrix from the user.
     *
     * @param scanner The Scanner object to read input.
     * @param rows    The number of rows.
     * @param cols    The number of columns.
     * @return The matrix as a 2D ArrayList.
     */
    public static ArrayList<ArrayList<Integer>> readMatrix(Scanner scanner, int rows, int cols) {
        System.out.println("Enter the elements of the matrix:");
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(scanner.nextInt());
            }
            matrix.add(row);
        }
        return matrix;
    }

    /**
     * Prints a matrix to the console.
     *
     * @param matrix The matrix to print.
     */
    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Performs scalar multiplication on a matrix.
     *
     * @param matrix The input matrix.
     * @param scalar The scalar value.
     * @return The new matrix after scalar multiplication.
     */
    public static ArrayList<ArrayList<Integer>> scalarMultiply(ArrayList<ArrayList<Integer>> matrix, int scalar) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (ArrayList<Integer> row : matrix) {
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int element : row) {
                newRow.add(element * scalar);
            }
            result.add(newRow);
        }
        return result;
    }
}
