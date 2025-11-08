import java.util.Scanner;

/**
 * This program converts a binary number (represented as an integer) to its decimal equivalent.
 * It demonstrates a custom implementation and also shows how to use Java's built-in method.
 */
public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.next();

        // --- Conversion using Custom Function ---
        long decimalFromCustom = convertBinaryToDecimal(binaryString);
        System.out.println("\nDecimal equivalent (from custom function): " + decimalFromCustom);

        // --- Conversion using Java's Built-in Method ---
        try {
            int decimalFromBuiltIn = Integer.parseInt(binaryString, 2);
            System.out.println("Decimal equivalent (from Integer.parseInt()): " + decimalFromBuiltIn);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number provided.");
        }


        scanner.close();
    }

    /**
     * Converts a binary number (given as a string) to its decimal equivalent.
     *
     * @param binaryString The binary number as a string.
     * @return The decimal equivalent as a long.
     */
    public static long convertBinaryToDecimal(String binaryString) {
        long decimalValue = 0;
        int power = 0;

        // Iterate through the binary string from right to left.
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            // If the character is '1', add the corresponding power of 2 to the result.
            if (binaryString.charAt(i) == '1') {
                decimalValue += Math.pow(2, power);
            }
            power++;
        }
        return decimalValue;
    }
}
