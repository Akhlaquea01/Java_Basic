import java.util.Scanner;

/**
 * This program reverses the digits of a given integer.
 * It also includes a check for 32-bit signed integer overflow.
 */
public class ReverseInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter an integer to reverse: ");
        int number = scanner.nextInt();

        // --- Reverse the Integer and Display the Result ---
        int reversedNumber = reverse(number);
        System.out.println("The reversed number is: " + reversedNumber);

        // Add a note if an overflow might have occurred.
        if (reversedNumber == 0 && number != 0) {
            System.out.println("(Note: The result is 0, which indicates an overflow.)");
        }

        scanner.close();
    }

    /**
     * Reverses the digits of an integer and handles potential overflow.
     *
     * @param x The integer to be reversed.
     * @return The reversed integer, or 0 if the reversal causes an overflow.
     */
    public static int reverse(int x) {
        // We use a 'long' to build the reversed number. This allows us to detect
        // if the reversed number exceeds the range of a standard 'int'.
        long reversed = 0;

        while (x != 0) {
            // Get the last digit of x.
            int digit = x % 10;
            // Append the digit to our reversed number.
            reversed = reversed * 10 + digit;
            // Remove the last digit from x.
            x /= 10;
        }

        // Check if the reversed number is within the valid range for an 'int'.
        // Integer.MAX_VALUE is the largest possible int value.
        // Integer.MIN_VALUE is the smallest possible int value.
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0; // Return 0 to indicate overflow.
        }

        // If no overflow, we can safely cast the 'long' back to an 'int'.
        return (int) reversed;
    }
}
