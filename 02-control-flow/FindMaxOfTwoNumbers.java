import java.util.Scanner;

/**
 * This program finds the maximum of two numbers entered by the user.
 * It demonstrates the use of an if-else if-else statement to handle multiple conditions.
 */
public class FindMaxOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // --- Determine the Maximum Number ---
        if (num1 > num2) {
            // This block executes if num1 is greater than num2.
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            // This block executes if num2 is greater than num1.
            System.out.println(num2 + " is greater than " + num1);
        } else {
            // This block executes if neither of the above conditions is true (i.e., the numbers are equal).
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
