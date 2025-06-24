import java.util.*;

public class Numeric_Stair_Pattern {
    /**
     * Take an integer N as input, print the corresponding pattern for N.
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= row; col++) {
                if (col != row) {
                    System.out.print(col + " ");
                } else {
                    System.out.print(col);
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
