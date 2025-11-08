import java.util.Scanner;

/**
 * This program performs a linear search to find if an element exists in an array.
 */
public class SearchElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Handle Multiple Test Cases ---
        System.out.print("How many search operations do you want to perform? ");
        int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {
            System.out.println("\n--- Search Operation #" + i + " ---");
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            System.out.print("Enter the element to search for: ");
            int target = scanner.nextInt();

            // --- Perform the Search and Display the Result ---
            if (linearSearch(arr, target)) {
                System.out.println("The element " + target + " was found in the array.");
            } else {
                System.out.println("The element " + target + " was not found in the array.");
            }
        }

        scanner.close();
    }

    /**
     * Performs a linear search to find a target element in an array.
     *
     * @param arr    The array to search through.
     * @param target The element to search for.
     * @return True if the target is found, false otherwise.
     */
    public static boolean linearSearch(int[] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return true; // Element found.
            }
        }
        return false; // Element not found.
    }
}
