import java.util.*;

public class Are_Matrices_Same {
    /*
     * You are given two matrices A & B of equal dimensions and you have to check
     * whether two matrices are equal or not.
     * 
     * NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j in the
     * given range.
     * Input 1:
     * 
     * A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
     * B = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
     * Output 1:
     * 
     * 1
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

        int result = solve(A, B);

        System.out.println(result);

        sc.close();
    }

    public static int solve(int[][] A, int[][] B) {
        int row = A.length, col = A[0].length;
        // Iterating over the rows
        for (int i = 0; i < row; i++)
            // Iterating over the columns
            for (int j = 0; j < col; j++)
                if (A[i][j] != B[i][j])
                    return 0;
        return 1;
    }

}
