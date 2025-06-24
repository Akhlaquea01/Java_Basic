import java.util.*;

public class Palindromic_Integer {
    /**
     * Take an integer A as input, determine whether it is palindromic or not.
     * 
     * A palindrome integer is an integer X for which reverse(X) = X where
     * reverse(X) is X with its digits reversed. For e.g., reverse(123) = 321. Note
     * : There will be no zeros at the start of a number.
     * 
     */
    public static void main(String[] args) {
        int r, sum = 0, temp;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Yes");
        else
            System.out.println("No");
        scn.close();
    }
}
