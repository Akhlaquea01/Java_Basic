import java.util.*;

public class Cube_of_Array {
    /*
     * You are provided with an integer array A. Return another array B of size same
     * as that of A such that B[i] = A[i]3 for 1 <= i <= |A| (1 based indexing).
     * Input 1 :
     * A=[2, 6, 8, 1]
     * Output 1 :
     * [8, 216, 512, 1]
     */
    public static void main(String[] args) {
        // create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // create an ArrayList of integers
        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.print("Enter the number of integers in the list: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            A.add(num);
        }

        // call the solve function with the user input
        ArrayList<Long> result = solve(A);

        // print the result
        System.out.println("cube" + result);

        // close the Scanner object
        scanner.close();
    }

    public static ArrayList<Long> solve(ArrayList<Integer> A) {
        ArrayList<Long> ans = new ArrayList<Long>();
        for (int i = 0; i < A.size(); i++) {
            long prod = (long) A.get(i) * (long) A.get(i) * (long) A.get(i);
            ans.add(prod);
        }
        return ans;
    }
}
