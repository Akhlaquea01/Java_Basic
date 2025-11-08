import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates the use of ArrayList, a core part of the Java Collections Framework.
 * An ArrayList is a resizable array that provides a dynamic way to store and manipulate lists of objects.
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        // --- Creating an ArrayList ---
        // It's a good practice to declare the list by its interface (List)
        // and initialize it with its concrete class (ArrayList).
        List<String> fruits = new ArrayList<>();

        // --- Adding Elements ---
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial list of fruits: " + fruits);

        // --- Accessing Elements ---
        String secondFruit = fruits.get(1);
        System.out.println("The second fruit in the list is: " + secondFruit);

        // --- Iterating over an ArrayList ---
        System.out.println("\nIterating over the list:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // --- Removing Elements ---
        fruits.remove("Banana");
        System.out.println("\nList after removing 'Banana': " + fruits);

        // --- Sorting an ArrayList ---
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        // --- Checking the Size ---
        System.out.println("The size of the list is: " + fruits.size());
    }
}
