import java.util.*;

public class LCM {
    /**
     * Implement a program that takes two positive integers A and B in the input and
     * prints their LCM.
     * 
     * Definition of LCM : The Least Common Multiple or LCM of two numbers say A and
     * B, is denoted as LCM (A,B). And the LCM is the smallest or least positive
     * integer that is divisible by both A and B
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int bigNo = (A > B) ? A : B;
        int gcd = 1;
        for (int i = 1; i <= bigNo; i++) {
            if (A % i == 0 && B % i == 0) {
                gcd = i;
            }
        }
        System.out.print((A * B) / gcd);
        scn.close();
    }
}
