import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class demonstrates the basics of exception handling in Java.
 * Exception handling is a mechanism to handle runtime errors in a controlled manner.
 */
public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // The 'try' block encloses the code that might throw an exception.
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("The result of the division is: " + result);

        } catch (ArithmeticException e) {
            // The 'catch' block catches and handles a specific type of exception.
            // ArithmeticException is thrown, for example, when you divide by zero.
            System.out.println("Error: Cannot divide by zero.");

        } catch (InputMismatchException e) {
            // You can have multiple 'catch' blocks to handle different types of exceptions.
            // InputMismatchException is thrown by the Scanner if the input is not of the expected type.
            System.out.println("Error: Please enter valid integers.");

        } finally {
            // The 'finally' block is always executed, whether an exception occurred or not.
            // It's often used for cleanup operations, like closing resources.
            System.out.println("The 'finally' block is always executed.");
            scanner.close();
        }

        System.out.println("The program continues after the try-catch-finally block.");
    }
}
