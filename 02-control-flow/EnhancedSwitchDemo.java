import java.util.Scanner;

/**
 * This class demonstrates the enhanced switch statement, a feature introduced in Java 14.
 * It offers a more concise and less error-prone syntax compared to the traditional switch.
 */
public class EnhancedSwitchDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Demo 1: Basic Enhanced Switch ---
        System.out.print("Enter a number between 1 and 5: ");
        int number = scanner.nextInt();

        // The '->' syntax replaces the colon and 'break' keyword.
        // Multiple case labels can be combined on a single line.
        switch (number) {
            case 1 -> System.out.println("The number was 1.");
            case 2 -> System.out.println("The number was 2.");
            case 3, 4, 5 -> {
                System.out.println("The number was 3, 4, or 5.");
                System.out.println("Specifically, it was: " + number);
            }
            default -> System.out.println("The number was not between 1 and 5.");
        }

        // --- Demo 2: Switch as an Expression ---
        System.out.print("\nEnter a month (e.g., JANUARY, FEBRUARY): ");
        String month = scanner.next().toUpperCase();

        // A switch can also be an expression that returns a value.
        String quarter = getQuarter(month);
        System.out.println(month + " is in the " + quarter + " quarter.");

        scanner.close();
    }

    /**
     * Returns the quarter of the year for a given month using a switch expression.
     *
     * @param month The month to find the quarter for.
     * @return The quarter as a string (e.g., "1st", "2nd").
     */
    public static String getQuarter(String month) {
        // The 'yield' keyword is used to return a value from a switch expression.
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                // You can still use a block of code and 'yield' for more complex cases.
                yield "Unknown";
            }
        };
    }
}
