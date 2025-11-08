import java.util.Scanner;

/**
 * This program calculates the absolute difference between the count of even and odd numbers in an array.
 */
public class EvenOddDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Handle Multiple Test Cases ---
        System.out.print("How many arrays do you want to process? ");
        int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {
            System.out.println("\n--- Processing Array #" + i + " ---");
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            // Calculate and display the difference.
            int difference = calculateEvenOddDifference(arr);
            System.out.println("The absolute difference between even and odd counts is: " + difference);
        }

        scanner.close();
    }

    /**
     * Calculates the absolute difference between the count of even and odd numbers.
     *
     * @param arr The input array.
     * @return The absolute difference.
     */
    public static int calculateEvenOddDifference(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        for (int number : arr) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return Math.abs(evenCount - oddCount);
    }
}
