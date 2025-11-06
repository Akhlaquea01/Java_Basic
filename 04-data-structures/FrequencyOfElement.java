import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program finds the frequency of a specific number in a list of integers.
 */
public class FrequencyOfElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input for the List ---
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // --- Get the Number to Search For ---
        System.out.print("\nEnter the number to find the frequency of: ");
        int target = scanner.nextInt();

        // --- Calculate and Display the Frequency ---
        int frequency = countOccurrences(numbers, target);
        System.out.println("The number " + target + " appears " + frequency + " time(s) in the list.");

        scanner.close();
    }

    /**
     * Counts the number of times a target integer appears in a list.
     *
     * @param list   The list of integers to search through.
     * @param target The integer to count the occurrences of.
     * @return The frequency of the target integer.
     */
    public static int countOccurrences(ArrayList<Integer> list, int target) {
        int count = 0;
        for (int number : list) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }
}
