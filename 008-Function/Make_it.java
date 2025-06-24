import java.util.*;

public class Make_it {
    /**
     * Given two integers A and B. A represents the count of mangoes and B represent
     * the count of slices of mangoes. Mango can be cut into three slices of
     * mangoes. A glass of mango shake can be formed by two slices of mangoes.
     * 
     * Find the maximum number of glasses of mango shakes you can make with A
     * mangoes and B slices of mangoes initially.
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        A = sc.nextInt();
        B = sc.nextInt();
        int volume = solve(A, B);
        sc.close();
        System.out.println("The maximum number of glasses of mango shakes you can make." + volume);
    }

    public static int solve(int A, int B) {
        double juice = (A * 3 + B) / 2;
        int glass = (int) Math.ceil(juice);
        return glass;
    }
}
