import java.util.Scanner;

/**
 * This program checks if a given integer is a palindrome.
 * A palindrome is a number that reads the same backward as forward (e.g., 121, 12321).
 */
public class PalindromicInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a positive integer to check if it's a palindrome: ");
        int number = scanner.nextInt();

        // --- Check and Display Result ---
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    /**
     * Checks if a given integer is a palindrome.
     *
     * @param number The integer to check.
     * @return True if the number is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(int number) {
        // A negative number cannot be a palindrome.
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number.
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // The number is a palindrome if its reversed version is the same as the original.
        return originalNumber == reversedNumber;
    }
}
