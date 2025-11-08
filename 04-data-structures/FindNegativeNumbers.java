import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program filters a list of numbers to find and display only the negative numbers.
 */
public class FindNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // --- Find and Display the Negative Numbers ---
        ArrayList<Integer> negativeNumbers = findNegative(numbers);

        if (negativeNumbers.isEmpty()) {
            System.out.println("\nThere are no negative numbers in the list.");
        } else {
            System.out.println("\nThe negative numbers in the list are: " + negativeNumbers);
        }

        scanner.close();
    }

    /**
     * Filters a list of integers, returning only the negative numbers.
     *
     * @param list The input list of integers.
     * @return A new list containing only the negative numbers.
     */
    public static ArrayList<Integer> findNegative(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int number : list) {
            if (number < 0) {
                result.add(number);
            }
        }
        return result;
    }
}
