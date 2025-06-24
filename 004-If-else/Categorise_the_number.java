import java.util.*;

public class Categorise_the_number {
    /*
     * Write a program to input a number(A) from user and print
     * 1 if it is positive,
     * -1 if it is negative,
     * 0 if it's neither positive nor negative.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        if (A == 0) {
            System.out.print(0);
        } else if (A > 0) {
            System.out.print(1);
        } else {
            System.out.print(-1);
        }
        scn.close();
    }
}
