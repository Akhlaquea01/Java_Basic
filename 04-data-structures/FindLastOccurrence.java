import java.util.Scanner;

/**
 * This program finds the last occurrence of a character in a string.
 * It demonstrates both a manual search from the end of the string and the use of the built-in String.lastIndexOf() method.
 */
public class FindLastOccurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the string to search in: ");
        String text = scanner.nextLine();

        System.out.print("Enter the character to search for: ");
        char searchChar = scanner.next().charAt(0);

        // --- Find the Last Occurrence ---
        // Method 1: Using the built-in lastIndexOf() method (preferred)
        int index = text.lastIndexOf(searchChar);

        // --- Display the Result ---
        if (index != -1) {
            System.out.println("The last occurrence of '" + searchChar + "' is at index: " + index);
        } else {
            System.out.println("The character '" + searchChar + "' was not found in the string.");
        }

        scanner.close();
    }
}
