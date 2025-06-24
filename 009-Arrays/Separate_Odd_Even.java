import java.util.*;

public class Separate_Odd_Even {
    /*
     * You are given an integer T denoting the number of test cases. For each test
     * case, you are given an integer array A.
     * You have to print the odd and even elements of array A in 2 separate lines.
     * 
     * NOTE: Array elements should have the same relative order as in A.
     * Input 1:
     * 
     * 2
     * 5
     * 1 2 3 4 5
     * 3
     * 4 3 2
     * 
     * Output 1:
     * 
     * 1 3 5
     * 2 4
     * 3
     * 4 2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int cnto = 0;
            int cnte = 0;

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (A[i] % 2 == 1) {
                    cnto++;
                } else {
                    cnte++;
                }
            }
            int[] B = new int[cnto];
            int[] C = new int[cnte];
            int ptrB = 0;
            int ptrC = 0;
            // looping from 0 to N-1
            for (int i = 0; i < N; i++) {
                if (A[i] % 2 == 1) {
                    B[ptrB] = A[i];
                    ptrB++;
                } else {
                    C[ptrC] = A[i];
                    ptrC++;
                }
            }
            // looping over count of odd integers
            for (int i = 0; i < cnto; i++) {
                System.out.print(B[i] + " ");
            }
            System.out.println();
            // looping over count of even integers
            for (int i = 0; i < cnte; i++) {
                System.out.print(C[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
