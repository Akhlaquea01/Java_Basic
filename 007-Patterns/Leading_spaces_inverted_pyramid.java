import java.util.*;

public class Leading_spaces_inverted_pyramid {
    /**
     * Take an integer N as input, print the corresponding pattern for N.
     * *****
     * _****
     * __***
     * ___**
     * ____*
     * 
     * -==space
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= N + 1 - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scn.close();
    }
}
