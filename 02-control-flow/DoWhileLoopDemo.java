import java.util.Scanner;

/**
 * This class demonstrates the use of a do-while loop.
 * A do-while loop is similar to a while loop, but it executes the loop body at least once.
 */
public class DoWhileLoopDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // The do-while loop is ideal for menu-driven programs
        // because you want the menu to be displayed at least once.
        do {
            // --- Display Menu ---
            System.out.println("\n--- Menu ---");
            System.out.println("1. Say Hello");
            System.out.println("2. Tell a Joke");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            // --- Process User's Choice ---
            switch (choice) {
                case 1:
                    System.out.println("Hello, World!");
                    break;
                case 2:
                    System.out.println("Why don't scientists trust atoms? Because they make up everything!");
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3); // The loop continues as long as the user doesn't choose to exit.

        scanner.close();
    }
}
