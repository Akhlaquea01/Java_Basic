import java.util.Scanner; /**
 * A simple calculator that demonstrates basic arithmetic operations,
 * input validation, method usage, and switch-case control flow in Java.
 * Supports addition, subtraction, multiplication, division, and modulus.
 */
public class Simple_Calculator {

    // Method to perform calculation based on operator
    public static int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': 
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            case '%':
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a % b;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first integer (A):");
        int A = scn.nextInt();

        System.out.println("Enter second integer (B):");
        int B = scn.nextInt();

        System.out.println("Choose operation (+, -, *, /, %):");
        char operator = scn.next().charAt(0);

        try {
            int result = calculate(A, B, operator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Demonstrate all operations
        System.out.println("All operations:");
        System.out.println("A + B = " + calculate(A, B, '+'));
        System.out.println("A - B = " + calculate(A, B, '-'));
        System.out.println("A * B = " + calculate(A, B, '*'));
        if (B != 0) {
            System.out.println("A / B = " + calculate(A, B, '/'));
            System.out.println("A % B = " + calculate(A, B, '%'));
        } else {
            System.out.println("A / B = Division by zero error");
            System.out.println("A % B = Division by zero error");
        }

        scn.close();
    }
}
