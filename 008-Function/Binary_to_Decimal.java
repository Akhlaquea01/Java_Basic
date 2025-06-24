import java.util.*;

public class Binary_to_Decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        A = sc.nextInt();
        long decimal_no = solve(A);
        sc.close();
        System.out.println("An integer denoting the decimal representation of " + A + " is " + decimal_no);
    }

    public static long solve(int A) {
        long dec_value = 0;
        long base = 1;
        long temp = A;
        while (temp > 0) {
            long last_digit = temp % 10;
            temp = temp / 10;
            dec_value += last_digit * base;
            base = base * 2;
        }
        return dec_value;
    }
}
