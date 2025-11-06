import java.util.Scanner;

/**
 * This program counts the number of vowels and consonants in a given string.
 */
public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Handle Multiple Test Cases ---
        System.out.print("How many strings do you want to process? ");
        int testCases = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character.

        for (int i = 1; i <= testCases; i++) {
            System.out.print("\nEnter string #" + i + ": ");
            String input = scanner.nextLine();

            // --- Count Vowels and Consonants ---
            int[] counts = countVowelsAndConsonants(input);

            // --- Display the Results ---
            System.out.println("Number of vowels: " + counts[0]);
            System.out.println("Number of consonants: " + counts[1]);
        }

        scanner.close();
    }

    /**
     * Counts the number of vowels and consonants in a string.
     *
     * @param s The input string.
     * @return An array of two integers, where the first element is the vowel count
     *         and the second is the consonant count.
     */
    public static int[] countVowelsAndConsonants(String s) {
        if (s == null) {
            return new int[]{0, 0};
        }

        int vowels = 0;
        int consonants = 0;
        String lowerCaseString = s.toLowerCase();

        for (char c : lowerCaseString.toCharArray()) {
            if (c >= 'a' && c <= 'z') { // Check if it's a letter.
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }
}
