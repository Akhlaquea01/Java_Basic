import java.util.*;

public class Simple_Calculator {
    /*
     * Given two numbers A and B. Print A+B, A*B, A-B, A/B in the same order.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        System.out.print((A + B) + " " + (A * B) + " " + (A - B) + " " + (A / B));
        scn.close();
    }
}
