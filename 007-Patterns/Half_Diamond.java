import java.util.*;

public class Half_Diamond {
    /*
    *Take an integer N as input, print the corresponding Half Diamond pattern with 2*N - 1 rows.
    * 
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
    */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        for (int row = 1; row <= N; row++) {
            for (int num = 1; num <= row; num++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = N + 1; row <= 2 * N; row++) {
            for (int num = 1; num < 2 * N + 1 - row; num++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scn.close();
    }
}
