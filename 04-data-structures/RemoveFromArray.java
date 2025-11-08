import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program removes an element from a list at a specified position.
 * It demonstrates the use of the ArrayList.remove(index) method.
 */
public class RemoveFromArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input for the List ---
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // --- Get the Position to Remove ---
        System.out.print("\nEnter the position to remove (1-based index): ");
        int position = scanner.nextInt();

        // --- Remove the Element ---
        // We subtract 1 from the position to convert from 1-based to 0-based indexing.
        if (position >= 1 && position <= numbers.size()) {
            System.out.println("\nOriginal list: " + numbers);
            numbers.remove(position - 1);
            System.out.println("List after removal: " + numbers);
        } else {
            System.out.println("Invalid position. The position must be between 1 and " + numbers.size());
        }

        scanner.close();
    }
}
