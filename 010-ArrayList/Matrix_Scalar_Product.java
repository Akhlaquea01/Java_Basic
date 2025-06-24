import java.util.*;

/*
 * You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.
 * Input 1:
 *A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 *B = 2
 * Output 1:
 *[[2, 4, 6], [8, 10, 12], [14, 16, 18]]
 */

public class Matrix_Scalar_Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of matrices: ");
        int numMatrices = scanner.nextInt();

        ArrayList<ArrayList<ArrayList<Integer>>> matrices = new ArrayList<>();

        for (int k = 0; k < numMatrices; k++) {
            System.out.println("Matrix " + (k + 1) + ":");

            // Input matrix A
            System.out.print("Enter the number of rows in matrix A: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns in matrix A: ");
            int cols = scanner.nextInt();

            ArrayList<ArrayList<Integer>> A = new ArrayList<>();
            System.out.println("Enter the elements of matrix A:");
            for (int i = 0; i < rows; i++) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                    int element = scanner.nextInt();
                    row.add(element);
                }
                A.add(row);
            }

            matrices.add(A);
        }

        // Scalar value B
        System.out.print("Enter the scalar value B: ");
        int B = scanner.nextInt();

        scanner.close();

        // Perform scalar multiplication on each matrix
        Matrix_Scalar_Product matrixScalarProduct = new Matrix_Scalar_Product();
        ArrayList<ArrayList<ArrayList<Integer>>> results = new ArrayList<>();

        for (ArrayList<ArrayList<Integer>> matrix : matrices) {
            ArrayList<ArrayList<Integer>> result = matrixScalarProduct.solve(matrix, B);
            results.add(result);
        }

        // Print the results
        System.out.println("Scalar multiplication of matrices A with B:");
        for (int k = 0; k < numMatrices; k++) {
            System.out.println("Matrix " + (k + 1) + ":");
            ArrayList<ArrayList<Integer>> result = results.get(k);
            for (ArrayList<Integer> row : result) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int row = A.size();
        int col = A.get(0).size();

        for (int i = 0; i < row; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                int val = A.get(i).get(j) * B;
                arr.add(val);
            }
            result.add(arr);
        }
        return result;
    }

}
