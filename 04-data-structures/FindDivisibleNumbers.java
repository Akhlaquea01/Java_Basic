import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program filters a list of numbers to find those that are divisible by both 5 and 7.
 */
public class FindDivisibleNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get User Input ---
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // --- Find and Display the Divisible Numbers ---
        ArrayList<Integer> divisibleNumbers = findNumbersDivisibleBy5And7(numbers);

        if (divisibleNumbers.isEmpty()) {
            System.out.println("\nThere are no numbers in the list that are divisible by both 5 and 7.");
        } else {
            System.out.println("\nThe numbers divisible by both 5 and 7 are: " + divisibleNumbers);
        }

        scanner.close();
    }

    /**
     * Filters a list of integers, returning only those divisible by both 5 and 7.
     *
     * @param list The input list of integers.
     * @return A new list containing the filtered numbers.
     */
    public static ArrayList<Integer> findNumbersDivisibleBy5And7(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int number : list) {
            // A number is divisible by both 5 and 7 if it's divisible by their LCM, which is 35.
            if (number % 35 == 0) {
                result.add(number);
            }
        }
        return result;
    }
}
