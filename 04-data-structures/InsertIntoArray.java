import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program inserts an element into a list at a specified position.
 * It demonstrates the use of the ArrayList.add(index, element) method.
 */
public class InsertIntoArray {

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

        // --- Get the Element and Position to Insert ---
        System.out.print("\nEnter the element to insert: ");
        int elementToInsert = scanner.nextInt();
        System.out.print("Enter the position to insert at (1-based index): ");
        int position = scanner.nextInt();

        // --- Insert the Element ---
        // We subtract 1 from the position to convert from 1-based to 0-based indexing.
        if (position >= 1 && position <= numbers.size() + 1) {
            numbers.add(position - 1, elementToInsert);
            System.out.println("\nOriginal list: " + numbers.subList(0, numbers.size() - 1));
            System.out.println("List after insertion: " + numbers);
        } else {
            System.out.println("Invalid position. The position must be between 1 and " + (numbers.size() + 1));
        }

        scanner.close();
    }
}
