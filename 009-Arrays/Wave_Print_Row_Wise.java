import java.util.*;

public class Wave_Print_Row_Wise {
    /*
     * You are given an integer matrix mat and you have to print the elements of the
     * matrix in wave form (row wise)
     * 
     * See example for clarifications regarding wave print.
     * 
     * Input 1:
     * 
     * [[4, 1, 2],
     * [7, 4, 4],
     * [3, 7, 4]]
     * 
     * Output 1:
     * 
     * 4 1 2 4 4 7 3 7 4
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int A[][] = new int[N][N];

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                A[col][row] = scn.nextInt();
            }
        }
        for (int col = 0; col < N; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < N; row++) {
                    System.out.print(A[row][col] + " ");
                }
            } else {
                for (int row = N - 1; row >= 0; row--) {
                    System.out.print(A[row][col] + " ");
                }
            }
        }
        scn.close();
    }
}
