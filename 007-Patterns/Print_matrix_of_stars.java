import java.util.*;

/**
 * Given two integers N and M as inputs, print a rectangle of N * M stars.
 * N = 3, M = 4
 * ****
 * ****
 * ****
 */
public class Print_matrix_of_stars {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        for (int row = 1; row <= N; row++) {

            for (int col = 1; col <= M; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scn.close();
    }
}
