/**
 * This class demonstrates all the basic arithmetic operations in Java.
 * It takes two numbers and shows the results of addition, subtraction,
 * multiplication, division, and modulus.
 */
public class ArithmeticOperationsDemo {

    public static void main(String[] args) {
        // Define two integer variables for the demonstration.
        int num1 = 10;
        int num2 = 5;

        System.out.println("Demonstrating arithmetic operations with " + num1 + " and " + num2 + ":");

        // --- Addition (+) ---
        int sum = num1 + num2;
        System.out.println("Addition (num1 + num2): " + sum);

        // --- Subtraction (-) ---
        int difference = num1 - num2;
        System.out.println("Subtraction (num1 - num2): " + difference);

        // --- Multiplication (*) ---
        int product = num1 * num2;
        System.out.println("Multiplication (num1 * num2): " + product);

        // --- Division (/) ---
        // Note that integer division truncates the decimal part.
        int quotient = num1 / num2;
        System.out.println("Integer Division (num1 / num2): " + quotient);

        // To get a precise result with decimals, we need to use floating-point numbers.
        double doubleQuotient = (double) num1 / num2;
        System.out.println("Floating-Point Division ((double) num1 / num2): " + doubleQuotient);

        // --- Modulus (%) ---
        // This gives the remainder of a division.
        int remainder = num1 % num2;
        System.out.println("Modulus (num1 % num2): " + remainder);

        // Example with a non-zero remainder.
        int num3 = 10;
        int num4 = 3;
        System.out.println("\n" + num3 + " % " + num4 + " = " + (num3 % num4));
    }
}
