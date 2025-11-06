import java.util.Scanner;

/**
 * This program determines if a given string can be made empty by repeatedly applying specific character removal rules.
 * The string consists only of 'p', 'a', and 'm'.
 * The allowed operations are:
 * 1. Remove one 'p' and one 'm'.
 * 2. Remove one 'a' and one 'm'.
 * The string can be emptied if and only if the count of 'm's is equal to the combined count of 'p's and 'a's.
 */
public class EmptyableString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a string consisting of 'p', 'a', and 'm': ");
        String input = scanner.nextLine();

        // --- Check if the String can be Emptied ---
        if (canBeEmptied(input)) {
            System.out.println("It is possible to make the string empty.");
        } else {
            System.out.println("It is not possible to make the string empty.");
        }

        scanner.close();
    }

    /**
     * Checks if the given string can be emptied based on the rules.
     *
     * @param s The input string.
     * @return True if the string can be emptied, false otherwise.
     */
    public static boolean canBeEmptied(String s) {
        int mCount = 0;
        int paCount = 0;

        // Count the occurrences of 'm' and the combined occurrences of 'p' and 'a'.
        for (char c : s.toCharArray()) {
            if (c == 'm') {
                mCount++;
            } else if (c == 'p' || c == 'a') {
                paCount++;
            } else {
                // For this specific problem, we can assume valid input.
                // In a real-world scenario, you might want to handle invalid characters.
            }
        }

        // The string can be emptied if the number of 'm's (which are always removed)
        // is equal to the number of 'p's and 'a's (which also must be removed).
        return mCount == paCount;
    }
}
