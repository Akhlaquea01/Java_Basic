import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program finds multiples of numbers from a second list within a first list.
 * For each number in the second list, it creates a new list of its multiples found in the first list.
 */
public class FindMultiples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        ArrayList<Integer> listA = readList(scanner, "Enter the numbers for the main list (space-separated):");
        ArrayList<Integer> listB = readList(scanner, "Enter the numbers to find multiples of (space-separated):");

        // --- Find Multiples and Display the Result ---
        ArrayList<ArrayList<Integer>> result = findMultiples(listA, listB);
        System.out.println("\nThe lists of multiples are:");
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Multiples of " + listB.get(i) + ": " + result.get(i));
        }

        scanner.close();
    }

    /**
     * Reads a list of integers from the user.
     *
     * @param scanner The Scanner object to read input.
     * @param prompt  The message to display to the user.
     * @return An ArrayList of integers.
     */
    public static ArrayList<Integer> readList(Scanner scanner, String prompt) {
        System.out.println(prompt);
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }

    /**
     * For each element in listB, finds all its multiples in listA.
     *
     * @param a The list of numbers to search through.
     * @param b The list of numbers to find multiples of.
     * @return A 2D ArrayList where the i-th row contains multiples of the i-th element of b.
     */
    public static ArrayList<ArrayList<Integer>> findMultiples(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int divisor : b) {
            ArrayList<Integer> multiples = new ArrayList<>();
            for (int number : a) {
                if (number % divisor == 0) {
                    multiples.add(number);
                }
            }
            result.add(multiples);
        }
        return result;
    }
}
