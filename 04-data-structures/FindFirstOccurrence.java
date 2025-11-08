import java.util.Scanner;

/**
 * This program finds the first occurrence of a character in a string.
 * It demonstrates both a manual linear search and the use of the built-in String.indexOf() method.
 */
public class FindFirstOccurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the string to search in: ");
        String text = scanner.nextLine();

        System.out.print("Enter the character to search for: ");
        char searchChar = scanner.next().charAt(0);

        // --- Find the First Occurrence ---
        // Method 1: Using the built-in indexOf() method (preferred)
        int index = text.indexOf(searchChar);

        // --- Display the Result ---
        if (index != -1) {
            System.out.println("The first occurrence of '" + searchChar + "' is at index: " + index);
        } else {
            System.out.println("The character '" + searchChar + "' was not found in the string.");
        }

        scanner.close();
    }
}
