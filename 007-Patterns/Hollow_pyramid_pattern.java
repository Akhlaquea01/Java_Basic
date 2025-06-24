import java.util.*;

public class Hollow_pyramid_pattern {
    /**
     * Take an integer N as input, print the corresponding pattern for N.
     * ********** // 0 spaces
     * ****__**** // 2 spaces
     * ***____*** // 4 spaces
     * **______** // 6 spaces
     * *________* // 8 spaces
     * @param args
     */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N - row + 1; col++) {
                System.out.print("*");
            }
            for (int col2 = 1; col2 <= (2 * row - 2); col2++) {
                System.out.print(" ");
            }
            for (int col3 = 1; col3 <= N - row + 1; col3++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scn.close();
    }
}
