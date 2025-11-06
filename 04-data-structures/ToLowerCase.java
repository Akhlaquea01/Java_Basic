import java.util.Scanner;

/**
 * This program converts a given string to its lowercase equivalent.
 * It demonstrates both a manual implementation and the use of the built-in String.toLowerCase() method.
 */
public class ToLowerCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a string to convert to lowercase: ");
        String input = scanner.nextLine();

        // --- Convert to Lowercase and Display the Result ---
        // Method 1: Using the built-in toLowerCase() method (preferred)
        String lowerCaseString = input.toLowerCase();
        System.out.println("\nLowercase string (using toLowerCase()): " + lowerCaseString);

        // Method 2: Manual conversion
        String manualLowerCaseString = toLowerCaseManual(input);
        System.out.println("Lowercase string (manual implementation): " + manualLowerCaseString);

        scanner.close();
    }

    /**
     * Manually converts a string to lowercase.
     *
     * @param s The input string.
     * @return The lowercase version of the string.
     */
    public static String toLowerCaseManual(String s) {
        if (s == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                // The difference between an uppercase and lowercase letter in ASCII is 32.
                sb.append((char) (c + 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
