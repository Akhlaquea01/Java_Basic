import java.util.Arrays;
import java.util.List;

/**
 * This class demonstrates the use of the for-each loop (also known as the enhanced for loop) in Java.
 * The for-each loop provides a simpler way to iterate over the elements of a collection or an array.
 */
public class ForEachLoopDemo {

    public static void main(String[] args) {

        // --- Using for-each with an Array ---
        System.out.println("--- Iterating over an Array ---");
        int[] numbers = {10, 20, 30, 40, 50};

        // The syntax is: for (type variable : collection)
        for (int number : numbers) {
            System.out.println("Processing number: " + number);
        }

        // --- Using for-each with a List ---
        System.out.println("\n--- Iterating over a List ---");
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");

        for (String fruit : fruits) {
            System.out.println("Current fruit: " + fruit);
        }

        // --- Calculating the Sum of Array Elements ---
        System.out.println("\n--- Summing Array Elements ---");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
