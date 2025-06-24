import java.util.ArrayList;
import java.util.Scanner;

public class Return_Numeric_Stair_Pattern {
    /*
     * Given an integer A in the function parameter.
     * Return a 2D array with A rows such that the i-th row has numbers from 1 to i.
     *
     * Input 2:
     * A = 4
     * Output 2:
     * [[1], [1, 2], [1, 2, 3], [1, 2, 3, 4]]
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int A = scanner.nextInt();

        ArrayList<ArrayList<Integer>> result = solve(A);
        System.out.println(result);

        scanner.close();
    }

    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= A; i++) {
            // For each i, prepare and add ith list
            ArrayList<Integer> l = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                l.add(j);
            }
            list.add(l);
        }

        return list;
    }
}
