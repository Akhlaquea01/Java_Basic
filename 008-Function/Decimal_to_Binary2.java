import java.util.*;

public class Decimal_to_Binary2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        A = sc.nextInt();
        int binary_no = solve(A);
        sc.close();
        System.out.println("An integer denoting the binary representation of " + A + " is " + binary_no);
    }

    public static int solve(int A) {
        int bin = 0;
        int pw = 1;
        // Running while A is positive integer
        while (A != 0) {
            bin += pw * (A % 2);
            A /= 2;
            pw *= 10;
        }
        return bin;
    }
}
