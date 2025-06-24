import java.util.*;

public class Print_perfect_squares {
    /**
     * Given a number A. Print all perfect squares less than or equal to A.
     * Notes - Perfect squares are integers whose square root is an integer.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int i = 1;
        while (i * i <= A) {
            System.out.print(i * i + " ");
            i++;
        }
        scn.close();
    }
}
