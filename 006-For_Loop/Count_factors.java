import java.util.*;

public class Count_factors {
    /**
     * Take an integer N as input and print the count of its factors.
     * The factor of a number is the number that divides it perfectly leaving no
     * remainder.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count = count + 1;
            }
        }
        System.out.print(count);
        scn.close();
    }
}
