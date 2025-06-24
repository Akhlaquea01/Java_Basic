import java.util.*;

public class Is_It_Prime {
    /**
     * Take an integer A as input, you have to tell whether it is a prime number or
     * not.
     * A prime number is a natural number greater than 1 which is divisible only by
     * 1 and itself.
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
        if (count == 2) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        scn.close();
    }
}
