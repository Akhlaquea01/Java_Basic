import java.util.*;

public class Skip_Even_No_Half_Pyramid {
    /**
     * Take an integer N as input, print the corresponding pattern for N.
     * N=5
     * 1
     * 1_
     * 1_3
     * 1_3_
     * 1_3_5
     * 
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        // int M=scn.nextInt();
        for (int row = 1; row <= N; row++) {

            for (int col = 1; col <= row; col++) {
                if (col % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(col);
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
