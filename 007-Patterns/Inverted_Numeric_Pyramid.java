import java.util.*;

public class Inverted_Numeric_Pyramid {
    /**
     * Take an integer N as input, print the corresponding Numeric Inverted Half
     * Pyramid pattern for N.
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     * 
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int row = 1; row <= N; row++) {

            for (int col = 1; col <= N + 1 - row; col++) {
                if (col == N + 1 - row) {
                    System.out.print(col);
                } else {
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
