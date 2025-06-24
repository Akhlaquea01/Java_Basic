import java.util.*;

public class Count_the_digits {
    /*
     * Take T (number of test cases) as input.
     * For each test case, take integer N as input and Print the count of digits of
     * that number.
     * 
     * Note: No of digits for number 0 is considered as 1.
     * Input 2:
     * 2
     * 100
     * 10101
     * Output 2:
     * 3
     * 5
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int j = 1; j <= N; j++) {
            int A = sc.nextInt();

            int sum = 1;

            for (int i = 2; i < A; i++) {
                if (A / 10 != 0) {
                    sum = sum + 1;
                    A = A / 10;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }

}
