import java.util.*;

public class First_vs_Last {
    /**
     * Write a program to input T numbers(N) from user and print first and last
     * digits of the given numbers.
     * 
     * @Input First line is T which means number of test cases.
     * 
     *        Each next T lines contain an integer N.
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int k = 1; k <= t; k++) {
            int n = scn.nextInt();
            int first = 0;
            int last = 0;
            // n on modulo with 10 will give last digit
            // and after dividing n by 10 each time we will get first digit
            last = n % 10;

            for (; n > 0; n = n / 10) {
                first = n % 10;
            }

            System.out.println(first + " " + last);
        }
        scn.close();
    }
}
