import java.util.Scanner;

/**
 * This program counts the number of uppercase letters in a given string.
 * It demonstrates the use of the Character.isUpperCase() method.
 */
public class CountUpperCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // --- Count Uppercase Letters and Display the Result ---
        int uppercaseCount = countUppercaseChars(input);
        System.out.println("The number of uppercase letters in the string is: " + uppercaseCount);

        scanner.close();
    }

    /**
     * Counts the number of uppercase characters in a string.
     *
     * @param s The input string.
     * @return The count of uppercase characters.
     */
    public static int countUppercaseChars(String s) {
        if (s == null) {
            return 0;
        }

        int count = 0;
        for (char c : s.toCharArray()) {
            // The Character.isUpperCase() method is a reliable way to check if a character is uppercase.
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
