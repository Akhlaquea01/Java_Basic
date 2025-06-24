import java.util.*;

public class Print_N_stars {
    /**
     * Given an integer N, print N stars in a single line.
     * N=5
     * *****
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int i = 1;
        while (i <= N) {
            System.out.print("*");
            i++;
        }
        scn.close();
    }
}
