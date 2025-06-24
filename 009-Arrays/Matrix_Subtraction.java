import java.util.*;

public class Matrix_Subtraction {
    /*
     * You are given two integer matrices A and B having same size(Both having same
     * number of rows (N) and columns (M). You have to subtract matrix B from A and
     * return the resultant matrix. (i.e. return the matrix A - B).
     * 
     * If A and B are two matrices of the same order (same dimensions). Then A - B
     * is a matrix of the same order as A and B and its elements are obtained by
     * doing an element wise subtraction of A from B.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the input matrices
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int[][] B = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Computing the matrix difference
        int[][] C = solve(A, B);

        // Printing the resulting matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    public static int[][] solve(int[][] A, int[][] B) {
        int N = A.length;
        int M = A[0].length;

        int[][] C = new int[N][M];
        // Iterating over the rows
        for (int i = 0; i < N; i++) {
            // Iterating over the columns
            for (int j = 0; j < M; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        return C;
    }
}
