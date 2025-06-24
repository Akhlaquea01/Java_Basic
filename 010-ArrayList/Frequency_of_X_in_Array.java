import java.util.ArrayList;
import java.util.Scanner;

public class Frequency_of_X_in_Array {
    /*
     * Given an integer array A. Find and return the frequency of number B in array
     * A.
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

        // read the integer value B from the user
        System.out.print("Enter an integer to search for: ");
        int B = scanner.nextInt();

        // call the solve function with the user input
        int result = solve(A, B);

        // print the result
        System.out.println("The number of occurrences of " + B + " in the list is: " + result);

        // close the Scanner object
        scanner.close();
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int ans = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == B)
                ans++;
        }
        return ans;
    }
}
