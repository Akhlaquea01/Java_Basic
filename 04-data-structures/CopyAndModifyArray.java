import java.util.Arrays;
import java.util.Scanner;

/**
 * This program creates a new array by copying an existing array and adding a specified value to each element.
 */
public class CopyAndModifyArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input for the Array ---
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] originalArray = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }

        // --- Get the Value to Add ---
        System.out.print("Enter the value to add to each element: ");
        int valueToAdd = scanner.nextInt();

        // --- Create the New Modified Array ---
        int[] modifiedArray = copyAndAdd(originalArray, valueToAdd);

        // --- Display the Results ---
        System.out.println("\nOriginal array: " + Arrays.toString(originalArray));
        System.out.println("Modified array: " + Arrays.toString(modifiedArray));

        scanner.close();
    }

    /**
     * Creates a new array where each element is the sum of the corresponding element
     * in the input array and a given value.
     *
     * @param arr   The input array.
     * @param value The value to add to each element.
     * @return The new, modified array.
     */
    public static int[] copyAndAdd(int[] arr, int value) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i] + value;
        }
        return newArray;
    }
}
