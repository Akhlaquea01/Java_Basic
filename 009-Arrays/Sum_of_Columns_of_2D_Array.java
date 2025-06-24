import java.util.*;

public class Sum_of_Columns_of_2D_Array {
    /*
     * Given a 2D integer array C[][] of A rows and B columns. Return an integer
     * array of size B that represents the sums of the columns of the 2D array C.
     * Input-
     * A = 3
     * B = 2
     * C = [[4, 1], [1, 3], [6, 2]]
     * Output-
     * [11, 6]
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[][] C = new int[A][B];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                C[i][j] = sc.nextInt();
            }
        }

        Sum_of_Columns_of_2D_Array obj = new Sum_of_Columns_of_2D_Array();
        int[] ans = obj.solve(A, B, C);
        System.out.println(Arrays.toString(ans));

        sc.close();
    }

    public int[] solve(int A, int B, int[][] C) {
        int[] ans = new int[B];

        for (int i = 0; i < B; i++) {
            // Finding the sum of elements of ith column
            for (int j = 0; j < A; j++) {
                ans[i] += C[j][i];
            }
        }

        return ans;
    }
}
