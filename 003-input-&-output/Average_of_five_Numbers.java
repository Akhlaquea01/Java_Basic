import java.util.*;

public class Average_of_five_Numbers {
    /**
     * Given 5 numbers A, B, C, D, E as input. Print the average of these 5 numbers
     * (correct up to 2 decimal places).
     *
     * @Input There are five lines in the input.
     *        Each line has an integer.
     * @Output Print the average of the input numbers (correct up to 2 decimal
     *         places).
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();
        int D = scn.nextInt();
        int E = scn.nextInt();
        double result = ((A + B + C + D + E) / 5.0);
        System.out.printf("%.2f", result);
        scn.close();

    }
}
