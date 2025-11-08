import java.util.Scanner;

/**
 * This program categorizes a number entered by the user as positive, negative, or zero.
 * It demonstrates the use of if-else if-else statements for conditional logic.
 */
public class CategoriseTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Use conditional statements to categorize the number.
        if (number > 0) {
            // This block executes if the number is positive.
            System.out.println("The number is positive.");
            // As per the original problem's output requirement:
            System.out.println("Output: 1");
        } else if (number < 0) {
            // This block executes if the number is negative.
            System.out.println("The number is negative.");
            // As per the original problem's output requirement:
            System.out.println("Output: -1");
        } else {
            // This block executes if the number is zero.
            System.out.println("The number is zero.");
            // As per the original problem's output requirement:
            System.out.println("Output: 0");
        }

        scanner.close();
    }
}
