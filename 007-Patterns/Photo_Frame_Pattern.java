import java.util.*;

public class Photo_Frame_Pattern {
    /**
     * Take an integer N as input, print the corresponding pattern for N.
     * *****
     * *   *
     * *   *
     * *   *
     * *****
     * @param args
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N; col++) {
                if (row == 1 || row == N) {
                    System.out.print("*");
                } else if (col == 1 || col == N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        scn.close();
    }
}
