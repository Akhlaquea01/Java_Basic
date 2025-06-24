import java.util.*;

public class Hollow_inverted_pyramid_pattern {
    /**
     * Take an integer N as input, print the corresponding pattern for N.
     * *________* // 8 spaces
     * *______** // 6 spaces
     * **____*** // 4 spaces
     * ***__**** // 2 spaces
     * ********* // 0 spaces
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int col = 1; col <= (2 * N - (2 * row)); col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scn.close();
    }
}
