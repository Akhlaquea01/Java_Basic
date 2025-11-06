import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program performs matrix multiplication on two compatible matrices.
 */
public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Read Matrix A ---
        System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int colsA = scanner.nextInt();
        ArrayList<ArrayList<Integer>> matrixA = readMatrix(scanner, rowsA, colsA);

        // --- Read Matrix B ---
        System.out.print("\nEnter the number of rows for matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int colsB = scanner.nextInt();
        ArrayList<ArrayList<Integer>> matrixB = readMatrix(scanner, rowsB, colsB);

        // --- Multiply Matrices and Display Result ---
        if (colsA != rowsB) {
            System.out.println("\nError: The matrices cannot be multiplied.");
            System.out.println("The number of columns in matrix A must be equal to the number of rows in matrix B.");
        } else {
            ArrayList<ArrayList<Integer>> resultMatrix = multiplyMatrices(matrixA, matrixB);
            System.out.println("\nThe product of the two matrices is:");
            printMatrix(resultMatrix);
        }

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
     * Multiplies two matrices.
     *
     * @param a The first matrix (M x N).
     * @param b The second matrix (N x P).
     * @return The resulting product matrix (M x P).
     */
    public static ArrayList<ArrayList<Integer>> multiplyMatrices(ArrayList<ArrayList<Integer>> a, ArrayList<ArrayList<Integer>> b) {
        int rowsA = a.size();
        int colsA = a.get(0).size();
        int colsB = b.get(0).size();

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < rowsA; i++) {
            ArrayList<Integer> resultRow = new ArrayList<>();
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += a.get(i).get(k) * b.get(k).get(j);
                }
                resultRow.add(sum);
            }
            result.add(resultRow);
        }
        return result;
    }
}
