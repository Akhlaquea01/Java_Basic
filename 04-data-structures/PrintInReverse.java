import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This program demonstrates two ways to print the elements of a list in reverse order.
 */
public class PrintInReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        System.out.println("\nOriginal list: " + numbers);

        // --- Method 1: Iterating Backwards ---
        System.out.print("Reversed list (manual iteration): ");
        printReverseManual(numbers);

        // --- Method 2: Using Collections.reverse() ---
        // This method modifies the list in-place.
        Collections.reverse(numbers);
        System.out.println("Reversed list (using Collections.reverse()): " + numbers);

        scanner.close();
    }

    /**
     * Prints the elements of an ArrayList in reverse order by iterating backwards.
     *
     * @param list The list to be printed in reverse.
     */
    public static void printReverseManual(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
