import java.time.Year;
import java.util.Scanner;

/**
 * This program demonstrates how to read user input from the console to calculate their age.
 * It covers obtaining the current year dynamically, handling different data types,
 * and includes robust error checking for user input.
 */
public class InteractiveAgeCalculator {

    public static void main(String[] args) {
        // Use the Scanner class for reliable input across different environments.
        // We pass System.in to the Scanner constructor to read from standard input (the console).
        Scanner scanner = new Scanner(System.in);

        // --- Get User's Name ---
        System.out.print("Hi, what's your name? ");
        String name = scanner.nextLine(); // Reads a full line of text.
        System.out.println("Hi " + name + ", thanks for joining us!");

        // --- Get User's Year of Birth with Validation ---
        int yearOfBirth = getYearOfBirth(scanner);

        // --- Calculate and Display Age ---
        int currentYear = Year.now().getValue(); // Get the current year dynamically.
        int age = currentYear - yearOfBirth;
        System.out.println("So, you are " + age + " years old.");

        // It's important to close the scanner when you're done with it to free up resources.
        scanner.close();
    }

    /**
     * Prompts the user for their year of birth and validates the input.
     *
     * @param scanner The Scanner object to read user input.
     * @return A valid year of birth.
     */
    private static int getYearOfBirth(Scanner scanner) {
        int currentYear = Year.now().getValue();
        int yearOfBirth = 0;

        // Loop until a valid year is entered.
        while (true) {
            System.out.print("What year were you born? ");
            String input = scanner.nextLine();

            try {
                // Convert the input string to an integer.
                yearOfBirth = Integer.parseInt(input);

                // Check if the year is within a reasonable range.
                if (yearOfBirth >= 1900 && yearOfBirth <= currentYear) {
                    break; // Exit the loop if the year is valid.
                } else {
                    System.out.println("Please enter a year between 1900 and " + currentYear + ".");
                }
            } catch (NumberFormatException e) {
                // This block catches errors if the user enters non-numeric text.
                System.out.println("Invalid input. Please enter a numeric year.");
            }
        }
        return yearOfBirth;
    }
}
