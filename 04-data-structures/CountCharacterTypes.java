import java.util.Scanner;

/**
 * This program counts the number of alphabetic characters and numeric digits in a string.
 * It then returns the count of the character type that occurs more frequently.
 */
public class CountCharacterTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a string with letters and digits: ");
        String input = scanner.nextLine();

        // --- Count Character Types and Display the Result ---
        int maxCount = findMaxCharacterTypeCount(input);
        System.out.println("The count of the most frequent character type is: " + maxCount);

        scanner.close();
    }

    /**
     * Counts the number of alphabetic and numeric characters and returns the larger count.
     *
     * @param s The input string.
     * @return The count of the most frequent character type (alphabetic or numeric).
     */
    public static int findMaxCharacterTypeCount(String s) {
        if (s == null) {
            return 0;
        }

        int letterCount = 0;
        int digitCount = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        // Return the larger of the two counts.
        return Math.max(letterCount, digitCount);
    }
}
