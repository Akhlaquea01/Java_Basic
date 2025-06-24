import java.util.*;

public class Even_Odd_Elements {
    /*
     * You are given T(number of test cases) integer arrays. For each array A, you
     * have to find the value of absolute difference between the counts of even and
     * odd elements in the array.
     * Input 2:
     * 1
     * 4 2 3 5 1
     * Output 2:
     * 2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            // Looping from 0 to N-1
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int cnte = 0;
            int cnto = 0;

            for (int i = 0; i < N; i++) {
                // If remainder is 1 then number if odd
                if (A[i] % 2 == 1) {
                    cnto++;
                }
                // else number is even
                else {
                    cnte++;
                }
            }

            System.out.println(Math.abs(cnte - cnto));
        }
        sc.close();
    }
}
