import java.util.*;

public class Sum_the_digits {
    /**
     * Take T (number of test cases) as input.
     * For each test case, take integer N as input and Print the sum of digits of
     * that number.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = scn.nextInt();
            int sum = 0;
            while (N != 0) {
                int temp = N % 10;
                N = N / 10;
                sum = sum + temp;
            }
            System.out.println(sum);
        }
        scn.close();
    }
}
