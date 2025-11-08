import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program performs matrix addition on two matrices of the same size.
 * It demonstrates how to work with 2D ArrayLists to represent matrices.
 */
public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Matrix Dimensions ---
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // --- Read Matrices from User ---
        System.out.println("\nEnter the elements of the first matrix:");
        ArrayList<ArrayList<Integer>> matrixA = readMatrix(scanner, rows, cols);

        System.out.println("\nEnter the elements of the second matrix:");
        ArrayList<ArrayList<Integer>> matrixB = readMatrix(scanner, rows, cols);

        // --- Perform Addition and Display Result ---
        ArrayList<ArrayList<Integer>> resultMatrix = addMatrices(matrixA, matrixB);
        System.out.println("\nThe sum of the two matrices is:");
        printMatrix(resultMatrix);

        scanner.close();
    }

    /**
     * Reads a matrix from the user.
     *
     * @param scanner The Scanner object to read input.
     * @param rows    The number of rows in the matrix.
     * @param cols    The number of columns in the matrix.
     * @return The matrix as a 2D ArrayList.
     */
    public static ArrayList<ArrayList<Integer>> readMatrix(Scanner scanner, int rows, int cols) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                row.add(scanner.nextInt());
            }
            matrix.add(row);
        }
        return matrix;
    }

    /**
     * Prints a matrix to the console.
     *
     * @param matrix The matrix to be printed.
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
     * Adds two matrices.
     *
     * @param a The first matrix.
     * @param b The second matrix.
     * @return The resulting sum matrix.
     */
    public static ArrayList<ArrayList<Integer>> addMatrices(ArrayList<ArrayList<Integer>> a, ArrayList<ArrayList<Integer>> b) {
        int rows = a.size();
        int cols = a.get(0).size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> resultRow = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                resultRow.add(a.get(i).get(j) + b.get(i).get(j));
            }
            result.add(resultRow);
        }
        return result;
    }
}
