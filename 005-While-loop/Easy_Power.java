import java.util.*;

public class Easy_Power {
    /**
     * You are given two integers A and B. You have to find the value of AB.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int i = 1;
        long mul = 1;

        while (i <= B) {
            mul = mul * A;
            i += 1;
        }
        System.out.print(mul);
        sc.close();
    }
}
