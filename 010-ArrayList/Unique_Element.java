import java.util.ArrayList;
import java.util.Scanner;

public class Unique_Element {
    /*
     * Given an Array of integers A, every element in it is repeated twice except
     * one, find that unique element.
     */
    public static int solve(ArrayList<Integer> A) {
        int ans = 0;
        for (int i = 0; i < A.size(); i++) {
            ans ^= A.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            A.add(num);
        }

        int unique = solve(A);
        System.out.println("The unique element in the array is: " + unique);

        scanner.close();
    }
}
