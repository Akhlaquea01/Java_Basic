import java.util.*;

public class Inverted_Half_Pyramid {
    /**
     * Given an integer N, print the corresponding Inverted Half Pyramid pattern for
     * N.
     * ****
     * ***
     * **
     * *
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N + 1 - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scn.close();
    }
}
