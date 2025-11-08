import java.util.Scanner;

/**
 * This class demonstrates the traditional switch statement in Java.
 * It's used to select one of many code blocks to be executed.
 */
public class TraditionalSwitchDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter a day of the week (1-7): ");
        int dayOfWeek = scanner.nextInt();

        // --- Determine the Day's Name ---
        System.out.println("\n--- Day of the Week ---");
        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Sunday.");
                break; // The 'break' keyword exits the switch block.
            case 2:
                System.out.println("It's Monday.");
                break;
            case 3:
                System.out.println("It's Tuesday.");
                break;
            case 4:
                System.out.println("It's Wednesday.");
                // Note: Missing 'break' here is intentional for demonstration.
            case 5:
                System.out.println("It's Thursday or maybe Friday (due to fall-through).");
                break;
            case 6:
            case 7:
                // Multiple cases can be grouped together.
                System.out.println("It's the weekend!");
                break;
            default:
                // The 'default' case runs if no other case matches.
                System.out.println("Invalid day of the week.");
        }

        scanner.close();
    }
}
