import java.util.Scanner;

/*
 * You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
 */

public class Main_Diagonal_Sum {
    public int solve(final int[][] A) {
        int N = A.length;

        int sum = 0;
        for (int i = 0; i < N; i++) {
            // A[i][i] is the main diagonal element
            sum += A[i][i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        Main_Diagonal_Sum diagonalSum = new Main_Diagonal_Sum();
        int sum = diagonalSum.solve(matrix);

        System.out.println("Sum of main diagonal elements: " + sum);

        scanner.close();
    }
}
