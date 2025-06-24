import java.util.*;

public class Stair_Pattern {
    /**
     * Take an integer N as input, print the corresponding stair pattern for N.
     * N = 4
     * *
     * **
     * ***
     * ****
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int row = 1; row <= N; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scn.close();
    }
}
