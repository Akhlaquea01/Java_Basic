import java.util.*;

public class Is_It_Perfect {
    /**
     * Take T (number of test cases) as input.
     * 
     * For each test case, take integer N as input, you have to tell whether it is a
     * perfect number or not.
     * 
     * A perfect number is a positive integer that is equal to the sum of its proper
     * positive divisors (excluding the number itself). A positive proper divisor
     * divides a number without leaving any remainder.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int j = 1; j <= N; j++) {
            int A = sc.nextInt();

            int sum = 0;

            for (int i = 1; i < A; i++) {
                if (A % i == 0) {
                    sum += i;
                }
            }

            if (sum == A) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
