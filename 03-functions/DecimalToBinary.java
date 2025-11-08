import java.util.Scanner;

/**
 * This program converts a decimal number to its binary equivalent.
 * It demonstrates a custom implementation and also shows how to use Java's built-in method.
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a positive integer: ");
        int decimalNumber = scanner.nextInt();

        if (decimalNumber < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // --- Conversion using Custom Function ---
            String binaryFromCustom = convertDecimalToBinary(decimalNumber);
            System.out.println("\nBinary equivalent (from custom function): " + binaryFromCustom);

            // --- Conversion using Java's Built-in Method ---
            String binaryFromBuiltIn = Integer.toBinaryString(decimalNumber);
            System.out.println("Binary equivalent (from Integer.toBinaryString()): " + binaryFromBuiltIn);
        }

        scanner.close();
    }

    /**
     * Converts a decimal number to its binary equivalent.
     *
     * @param decimal The decimal number to convert.
     * @return The binary representation as a string.
     */
    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        // Use a StringBuilder for efficient string concatenation.
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            // The remainder when dividing by 2 gives the binary digit (0 or 1).
            int remainder = decimal % 2;
            // Prepend the remainder to the binary string.
            binary.insert(0, remainder);
            // Integer division by 2 prepares for the next digit.
            decimal /= 2;
        }
        return binary.toString();
    }
}
