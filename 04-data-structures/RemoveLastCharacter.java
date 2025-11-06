import java.util.Scanner;

/**
 * This program removes the last character from a given string.
 * It demonstrates the use of the substring() method for string manipulation.
 */
public class RemoveLastCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // --- Remove the Last Character and Display the Result ---
        String modifiedString = removeLastChar(input);
        System.out.println("The string after removing the last character is: \"" + modifiedString + "\"");

        scanner.close();
    }

    /**
     * Removes the last character from a string.
     *
     * @param s The input string.
     * @return The string with its last character removed.
     */
    public static String removeLastChar(String s) {
        // Handle null or empty strings to avoid errors.
        if (s == null || s.isEmpty()) {
            return s;
        }
        // The substring() method can be used to extract a part of a string.
        // We take the substring from the beginning (index 0) up to (but not including) the last character.
        return s.substring(0, s.length() - 1);
    }
}
