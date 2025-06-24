import java.util.*;

public class HCF {
    /**
     * Write a program to input two integers A & B from user and print their HCF.
     * 
     * Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common
     * divisor) of two positive integers happens to be the largest positive integer
     * that divides the numbers without leaving a remainder.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int lowerNumber = 0;
        if (A < B) {
            lowerNumber = A;
        } else {
            lowerNumber = B;
        }
        int hcf = 0;
        for (int i = 1; i <= lowerNumber; i++) {
            if (A % i == 0 && B % i == 0) {
                hcf = i;
            }
        }
        System.out.print(hcf);
        scn.close();
    }
}
