import java.util.*;

public class Count_of_primes {
    /*
     * You will be given an integer n. You need to return the count of prime numbers
     * less than or equal to n.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        A = sc.nextInt();
        int prime_no = solve(A);
        sc.close();
        System.out.println("The count of prime numbers less than or equal to " + A + " is " + prime_no);
    }

    public static int solve(int A) {
        int i = 0;
        int num = 0;
        int x = 0;
        for (i = 1; i <= A; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                x += 1;
            }
        }
        return x;
    }
}
