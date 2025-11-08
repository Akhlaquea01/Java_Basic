import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program checks if a given square matrix is an identity matrix.
 * An identity matrix has 1s on the main diagonal and 0s elsewhere.
 */
public class IdentityMatrixCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get Matrix Dimensions ---
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        // --- Read Matrix from User ---
        System.out.println("Enter the elements of the matrix:");
        ArrayList<ArrayList<Integer>> matrix = readMatrix(scanner, size, size);

        // --- Check if it's an Identity Matrix and Display Result ---
        if (isIdentityMatrix(matrix)) {
            System.out.println("\nThe given matrix is an identity matrix.");
        } else {
            System.out.println("\nThe given matrix is not an identity matrix.");
        }

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
     * Checks if a given square matrix is an identity matrix.
     *
     * @param matrix The matrix to check.
     * @return True if it is an identity matrix, false otherwise.
     */
    public static boolean isIdentityMatrix(ArrayList<ArrayList<Integer>> matrix) {
        int size = matrix.size();
        for (int i = 0; i < size; i++) {
            // Check if the row has the correct number of columns.
            if (matrix.get(i).size() != size) {
                return false;
            }
            for (int j = 0; j < size; j++) {
                // On the main diagonal (i == j), the element should be 1.
                if (i == j && matrix.get(i).get(j) != 1) {
                    return false;
                }
                // Off the main diagonal (i != j), the element should be 0.
                if (i != j && matrix.get(i).get(j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
