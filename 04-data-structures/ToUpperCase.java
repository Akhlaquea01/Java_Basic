import java.util.Scanner;

/**
 * This program converts a given string to its uppercase equivalent.
 * It demonstrates both a manual implementation and the use of the built-in String.toUpperCase() method.
 */
public class ToUpperCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a string to convert to uppercase: ");
        String input = scanner.nextLine();

        // --- Convert to Uppercase and Display the Result ---
        // Method 1: Using the built-in toUpperCase() method (preferred)
        String upperCaseString = input.toUpperCase();
        System.out.println("\nUppercase string (using toUpperCase()): " + upperCaseString);

        // Method 2: Manual conversion
        String manualUpperCaseString = toUpperCaseManual(input);
        System.out.println("Uppercase string (manual implementation): " + manualUpperCaseString);

        scanner.close();
    }

    /**
     * Manually converts a string to uppercase.
     *
     * @param s The input string.
     * @return The uppercase version of the string.
     */
    public static String toUpperCaseManual(String s) {
        if (s == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                // The difference between a lowercase and uppercase letter in ASCII is 32.
                sb.append((char) (c - 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
