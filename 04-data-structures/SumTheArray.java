import java.util.Arrays;
import java.util.Scanner;

/**
 * This program calculates the sum of all elements in an array.
 */
public class SumTheArray {

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

        // --- Calculate and Display the Sum ---
        long sum = calculateSum(numbers);
        System.out.println("\nFor the array: " + Arrays.toString(numbers));
        System.out.println("The sum of all elements is: " + sum);

        scanner.close();
    }

    /**
     * Calculates the sum of all elements in an integer array.
     *
     * @param arr The input array.
     * @return The sum of the elements as a long to prevent potential overflow.
     */
    public static long calculateSum(int[] arr) {
        long sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum;
    }
}
