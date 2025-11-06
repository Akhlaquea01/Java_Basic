import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program finds the transpose of a given matrix.
 * The transpose of a matrix is obtained by flipping it over its main diagonal.
 */
public class MatrixTranspose {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Read Matrix ---
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        ArrayList<ArrayList<Integer>> matrix = readMatrix(scanner, rows, cols);

        // --- Transpose the Matrix and Display the Result ---
        ArrayList<ArrayList<Integer>> transposedMatrix = transpose(matrix);
        System.out.println("\nThe original matrix is:");
        printMatrix(matrix);
        System.out.println("\nThe transposed matrix is:");
        printMatrix(transposedMatrix);

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
     * Transposes a given matrix.
     *
     * @param matrix The input matrix.
     * @return The transposed matrix.
     */
    public static ArrayList<ArrayList<Integer>> transpose(ArrayList<ArrayList<Integer>> matrix) {
        int rows = matrix.size();
        int cols = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> transposed = new ArrayList<>();
        for (int j = 0; j < cols; j++) {
            ArrayList<Integer> newRow = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                newRow.add(matrix.get(i).get(j));
            }
            transposed.add(newRow);
        }
        return transposed;
    }
}
