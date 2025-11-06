import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program separates the odd and even numbers from a list into two separate lists.
 */
public class SeparateOddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Handle Multiple Test Cases ---
        System.out.print("How many lists do you want to process? ");
        int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {
            System.out.println("\n--- Processing List #" + i + " ---");
            System.out.print("Enter the number of elements in the list: ");
            int n = scanner.nextInt();

            ArrayList<Integer> numbers = new ArrayList<>();
            System.out.println("Enter the elements of the list:");
            for (int j = 0; j < n; j++) {
                numbers.add(scanner.nextInt());
            }

            // --- Separate the Odd and Even Numbers ---
            ArrayList<Integer> oddNumbers = new ArrayList<>();
            ArrayList<Integer> evenNumbers = new ArrayList<>();
            separate(numbers, oddNumbers, evenNumbers);

            // --- Display the Results ---
            System.out.println("Odd numbers: " + oddNumbers);
            System.out.println("Even numbers: " + evenNumbers);
        }

        scanner.close();
    }

    /**
     * Separates a list of integers into two lists: one for odd numbers and one for even numbers.
     *
     * @param original The original list of numbers.
     * @param odd      An empty list to be filled with odd numbers.
     * @param even     An empty list to be filled with even numbers.
     */
    public static void separate(ArrayList<Integer> original, ArrayList<Integer> odd, ArrayList<Integer> even) {
        for (int number : original) {
            if (number % 2 == 0) {
                even.add(number);
            } else {
                odd.add(number);
            }
        }
    }
}
