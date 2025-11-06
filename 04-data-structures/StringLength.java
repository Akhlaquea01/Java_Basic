import java.util.Scanner;

/**
 * This program calculates the length of one or more strings.
 * It demonstrates the use of the String.length() method.
 */
public class StringLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Handle Multiple Test Cases ---
        System.out.print("How many strings do you want to find the length of? ");
        int testCases = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character.

        for (int i = 1; i <= testCases; i++) {
            System.out.print("\nEnter string #" + i + ": ");
            String input = scanner.nextLine();
            int length = input.length();
            System.out.println("The length of the string is: " + length);
        }

        scanner.close();
    }
}
