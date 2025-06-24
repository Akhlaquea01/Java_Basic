import java.util.*;

public class Full_pyramid {
    /**
     * Take an integer N, print the corresponding Full Pyramid pattern for N.
         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N - row; col++) {
                System.out.print(" ");
            }
            for (int col2 = 1; col2 <= row; col2++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scn.close();
    }
}
