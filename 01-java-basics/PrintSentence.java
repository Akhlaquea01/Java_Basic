import java.util.Scanner;

/**
 * This program demonstrates how to read a full line of text (a sentence) from the user
 * and then print it back to the console. It highlights the use of the nextLine() method.
 */
public class PrintSentence {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence.
        System.out.print("Please enter a sentence: ");

        // Use the nextLine() method to read the entire line of input, including spaces.
        String sentence = scanner.nextLine();

        // Print the sentence that was entered by the user.
        System.out.println("You entered: \"" + sentence + "\"");

        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}
