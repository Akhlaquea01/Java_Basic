import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A simple interactive calculator that performs basic arithmetic operations.
 * This program demonstrates user input handling, methods, switch-case statements,
 * and robust error checking.
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user.
        int num1 = getNumber(scanner, "Enter the first integer: ");
        int num2 = getNumber(scanner, "Enter the second integer: ");

        // Get the desired operation from the user.
        char operator = getOperator(scanner);

        // Perform the calculation and display the result.
        try {
            double result = calculate(num1, num2, operator);
            System.out.println("The result of " + num1 + " " + operator + " " + num2 + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    /**
     * Prompts the user for an integer and handles invalid input.
     *
     * @param scanner The Scanner object to read user input.
     * @param prompt  The message to display to the user.
     * @return The integer entered by the user.
     */
    public static int getNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input from the scanner.
            }
        }
    }

    /**
     * Prompts the user for an operator and validates the input.
     *
     * @param scanner The Scanner object to read user input.
     * @return The operator character entered by the user.
     */
    public static char getOperator(Scanner scanner) {
        while (true) {
            System.out.print("Choose an operation (+, -, *, /): ");
            String input = scanner.next();
            if (input.length() == 1 && "+-*/".contains(input)) {
                return input.charAt(0);
            } else {
                System.out.println("Invalid operator. Please choose from +, -, *, /.");
            }
        }
    }

    /**
     * Performs a calculation based on the given numbers and operator.
     *
     * @param a        The first number.
     * @param b        The second number.
     * @param operator The operator character.
     * @return The result of the calculation.
     */
    public static double calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
                return (double) a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
