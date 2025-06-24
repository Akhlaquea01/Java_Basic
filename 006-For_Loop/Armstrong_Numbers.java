import java.util.*;

public class Armstrong_Numbers {
    /**
     * You are given an integer N you need to print all the Armstrong Numbers
     * between 1 to N. (N inclusive).
     * 
     * If sum of cubes of each digit of the number is equal to the number itself,
     * then the number is called an Armstrong number.
     * 
     * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
     * 
     * Note: All the test cases in this problem are limited to 3 digit numbers.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            int j = i;
            while (j > 0) {
                int temp = j % 10;
                sum = sum + (temp * temp * temp);
                j = j / 10;
            }
            if (sum == i) {
                System.out.println(sum);
            }
        }
        scn.close();
    }
}
