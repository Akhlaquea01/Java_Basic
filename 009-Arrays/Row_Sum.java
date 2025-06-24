import java.util.Scanner;

public class Row_Sum {
    /*
     * You are given a 2D integer matrix A, return a 1D integer array containing
     * row-wise sums of original matrix.
     * Input 1:
     * 
     * [1,2,3,4]
     * [5,6,7,8]
     * [9,2,3,4]
     * 
     * Output 1:
     * 
     * [10,26,18]
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the input matrix
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int[] rowSums = solve(A);

        // Printing the row sums
        for (int i = 0; i < n; i++) {
            System.out.print(rowSums[i] + " ");
        }
        System.out.println();

        sc.close();
    }

    public static int[] solve(int[][] A) {
        int n = A.length, m = A[0].length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            // Finding sum of elements of ith row
            for (int j = 0; j < m; j++) {
                rowSum += A[i][j];
            }
            ans[i] = rowSum;
        }
        return ans;
    }
}
