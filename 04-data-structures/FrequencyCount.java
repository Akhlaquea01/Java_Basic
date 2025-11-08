import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This program takes a list of integers and returns a new list where each element
 * is the frequency of the corresponding element in the original list.
 * It demonstrates the use of a HashMap for efficient frequency counting.
 */
public class FrequencyCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // --- Calculate and Display Frequencies ---
        ArrayList<Integer> frequencyList = getFrequencyList(numbers);
        System.out.println("\nOriginal list: " + numbers);
        System.out.println("Frequency list: " + frequencyList);

        scanner.close();
    }

    /**
     * Creates a list of frequency counts corresponding to the original list.
     *
     * @param list The input list of integers.
     * @return A new list of frequency counts.
     */
    public static ArrayList<Integer> getFrequencyList(ArrayList<Integer> list) {
        // Use a HashMap to store the frequency of each number.
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // First pass: count the frequency of each number.
        for (int number : list) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        // Second pass: create the result list.
        ArrayList<Integer> result = new ArrayList<>();
        for (int number : list) {
            result.add(frequencyMap.get(number));
        }

        return result;
    }
}
