import java.util.*;

public class Inverted_Full_Pyramid {
    /*
    *Take an integer N as input, and print the corresponding Inverted Full Pyramid pattern for N.
     * * * * * 
      * * * * 
       * * * 
        * *    
         * 
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= N - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scn.close();
    }
}
