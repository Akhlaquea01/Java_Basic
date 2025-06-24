import java.util.*;

public class Check_if_Array_is_Sorted {
    public static void main(String[] args) {
        /*
         * Given an array A, check if it is sorted in ascending order or not.
         */

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
        int result = solve(A);

        // print the result
        System.out.println("Is Array Sorted?" + result);

        // close the Scanner object
        scanner.close();
    }

    public static int solve(ArrayList<Integer> A) {
        boolean flag = true;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) < A.get(i - 1)) {
                flag = false;
            }
        }
        if (flag) {
            return 1;
        }
        return 0;
    }
}
