import java.util.Scanner;

/**
 * This class demonstrates the basic if-else statement in Java.
 * An if-else statement is used to execute different blocks of code based on a condition.
 */
public class IfElseDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Voting Eligibility Checker ---
        System.out.println("--- Voting Eligibility Checker ---");
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // The 'if' statement checks if the condition (age >= 18) is true.
        if (age >= 18) {
            // This block of code is executed if the condition is true.
            System.out.println("You are eligible to vote.");
        } else {
            // This block of code is executed if the condition is false.
            System.out.println("You are not eligible to vote yet.");
        }

        scanner.close();
    }
}
