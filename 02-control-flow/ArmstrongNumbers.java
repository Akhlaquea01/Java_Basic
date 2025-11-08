import java.util.Scanner;

/**
 * This program finds and prints all Armstrong numbers up to a given limit.
 * An Armstrong number is a number that is equal to the sum of the cubes of its own digits.
 * For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 */
public class ArmstrongNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the upper limit.
        System.out.print("Enter a positive integer limit: ");
        int limit = scanner.nextInt();

        System.out.println("Armstrong numbers between 1 and " + limit + ":");

        // Iterate from 1 up to the user-defined limit.
        for (int i = 1; i <= limit; i++) {
            // Check if the current number is an Armstrong number.
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    /**
     * Checks if a given number is an Armstrong number.
     *
     * @param number The number to check.
     * @return True if the number is an Armstrong number, false otherwise.
     */
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        // Loop to extract digits and calculate the sum of their cubes.
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        // An Armstrong number is equal to the sum of the cubes of its digits.
        return sum == originalNumber;
    }
}
