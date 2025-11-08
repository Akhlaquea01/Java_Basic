import java.util.Scanner;

/**
 * This class demonstrates various ways to handle input and output in Java.
 * It covers printing to the console, string concatenation, and reading user input.
 */
public class InputAndOutputDemo {

    public static void main(String[] args) {

        // --- Console Output ---

        // System.out.print() prints text to the console without adding a new line.
        System.out.print("Hello, ");
        System.out.print("World!");

        // System.out.println() prints text and adds a new line at the end.
        System.out.println("\n--- Using println ---");
        System.out.println("This is the first line.");
        System.out.println("This is the second line.");

        // --- String Concatenation ---

        // The '+' operator can be used to join strings (concatenate).
        System.out.println("\n--- String Concatenation ---");
        System.out.println("Java" + " is" + " fun!");

        // You can also concatenate strings with other data types.
        String course = "Java";
        int version = 17;
        System.out.println("We are learning " + course + " " + version + ".");

        // Note the order of operations with numbers and strings.
        System.out.println("10 + 20 = " + (10 + 20)); // Prints "10 + 20 = 30"
        System.out.println("Concatenation: " + 10 + 20); // Prints "Concatenation: 1020"

        // --- User Input with Scanner ---

        // The Scanner class is used to get user input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- User Input ---");

        // Reading an integer.
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();
        System.out.println("You entered the integer: " + userInt);

        // Reading a double.
        System.out.print("Enter a double: ");
        double userDouble = scanner.nextDouble();
        System.out.println("You entered the double: " + userDouble);

        // Reading a single word (token).
        System.out.print("Enter a single word: ");
        String userWord = scanner.next();
        System.out.println("You entered the word: " + userWord);

        // Important: Consume the leftover newline character after reading a number or word.
        scanner.nextLine();

        // Reading a full line of text.
        System.out.print("Enter a full sentence: ");
        String userSentence = scanner.nextLine();
        System.out.println("You entered the sentence: \"" + userSentence + "\"");

        // Always close the scanner when you're done with it.
        scanner.close();
    }
}
