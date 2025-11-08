import java.util.Scanner;

/**
 * This program modifies a string by inserting the alphabetical index after each character.
 * For example, "azd" becomes "a1z26d4".
 */
public class InsertCharIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a lowercase string: ");
        String input = scanner.nextLine();

        // --- Process the String and Display the Result ---
        String modifiedString = insertIndices(input);
        System.out.println("The modified string is: " + modifiedString);

        scanner.close();
    }

    /**
     * Inserts the alphabetical index after each character in a string.
     *
     * @param s The input string (should contain only lowercase English letters).
     * @return The modified string.
     */
    public static String insertIndices(String s) {
        // Using a StringBuilder is much more efficient than concatenating strings in a loop.
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            // Append the character.
            sb.append(c);
            // Calculate the index (a=1, b=2, etc.).
            // This works because characters in Java can be treated as numbers (their ASCII/Unicode values).
            int index = c - 'a' + 1;
            // Append the index.
            sb.append(index);
        }

        return sb.toString();
    }
}
