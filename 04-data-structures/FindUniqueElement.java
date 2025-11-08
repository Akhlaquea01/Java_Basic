import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program finds the unique element in a list where every other element appears exactly twice.
 * It demonstrates the use of the bitwise XOR operator (^) for an efficient solution.
 */
public class FindUniqueElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the elements (each number should appear twice, except for one):");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // --- Find and Display the Unique Element ---
        int uniqueElement = findUnique(numbers);
        System.out.println("\nThe unique element in the list is: " + uniqueElement);

        scanner.close();
    }

    /**
     * Finds the unique element in a list using the XOR bitwise operator.
     *
     * @param list The input list of integers.
     * @return The unique element.
     */
    public static int findUnique(ArrayList<Integer> list) {
        // The XOR operator has two important properties:
        // 1. A number XORed with itself is 0 (e.g., 5 ^ 5 = 0).
        // 2. A number XORed with 0 is the number itself (e.g., 5 ^ 0 = 5).
        //
        // By XORing all the elements in the list, the duplicate numbers will cancel each other out (resulting in 0),
        // and what remains will be the unique number.
        int unique = 0;
        for (int number : list) {
            unique ^= number;
        }
        return unique;
    }
}
