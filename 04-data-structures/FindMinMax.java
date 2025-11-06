import java.util.Arrays;
import java.util.Scanner;

/**
 * This program finds the minimum and maximum elements in an array of integers.
 */
public class FindMinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // --- Find and Display the Min and Max ---
        int[] minMax = findMinAndMax(numbers);
        System.out.println("\nFor the array: " + Arrays.toString(numbers));
        System.out.println("The minimum value is: " + minMax[0]);
        System.out.println("The maximum value is: " + minMax[1]);

        scanner.close();
    }

    /**
     * Finds the minimum and maximum values in an array.
     *
     * @param arr The input array.
     * @return An array of two integers, where the first element is the minimum
     *         and the second is the maximum.
     */
    public static int[] findMinAndMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            // Handle empty or null arrays.
            return new int[0];
        }

        int min = arr[0];
        int max = arr[0];

        // Iterate through the array to find the min and max.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }
}
