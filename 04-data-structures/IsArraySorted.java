import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program checks if a given array (or ArrayList) of integers is sorted in non-decreasing order.
 */
public class IsArraySorted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // --- Check if the Array is Sorted ---
        if (isArraySorted(numbers)) {
            System.out.println("\nThe array is sorted in non-decreasing order.");
        } else {
            System.out.println("\nThe array is not sorted.");
        }

        scanner.close();
    }

    /**
     * Checks if an ArrayList of integers is sorted in non-decreasing order.
     *
     * @param arr The ArrayList to check.
     * @return True if the array is sorted, false otherwise.
     */
    public static boolean isArraySorted(ArrayList<Integer> arr) {
        // An array with 0 or 1 elements is always considered sorted.
        if (arr.size() <= 1) {
            return true;
        }

        // Iterate through the array, comparing each element with the one before it.
        for (int i = 1; i < arr.size(); i++) {
            // If we find an element that is smaller than its predecessor, the array is not sorted.
            if (arr.get(i) < arr.get(i - 1)) {
                return false;
            }
        }

        // If the loop completes without finding any out-of-order elements, the array is sorted.
        return true;
    }
}
