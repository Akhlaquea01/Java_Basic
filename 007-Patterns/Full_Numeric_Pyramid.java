import java.util.*;

public class Full_Numeric_Pyramid {
    /**
     * Given an integer N as input, print the corresponding Full Numeric Pyramid pattern for N.
     * 0 0 0 0 1 0 0 0 0 
       0 0 0 2 3 2 0 0 0 
       0 0 3 4 5 4 3 0 0
       0 4 5 6 7 6 5 4 0
       5 6 7 8 9 8 7 6 5
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            // Printing the number of zeros before the pattern starts.
            for (int j = 1; j <= spaces; j++)
                System.out.print(0 + " ");
            // Calculating the range of numbers for a particular i
            int lim = 2 * i - 1;
            // Printing the increasing numbers from i to 2*i-1
            for (int j = i; j <= lim; j++) {
                System.out.print(j + " ");
            }
            // Printing the decreasing numbers
            for (int j = lim - 1; j >= i; j--) {
                System.out.print(j + " ");
            }
            // Printing the calculated number of zeros after the pattern has ended
            for (int j = 1; j <= spaces; j++)
                System.out.print(0 + " ");

            System.out.println("");
        }
        sc.close();
    }
}
