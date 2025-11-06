import java.util.HashSet;
import java.util.Set;

/**
 * This class demonstrates the use of HashSet, a core part of the Java Collections Framework.
 * A HashSet is a collection of items where every item is unique.
 */
public class HashSetDemo {

    public static void main(String[] args) {

        // --- Creating a HashSet ---
        Set<String> uniqueFruits = new HashSet<>();

        // --- Adding Elements ---
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Cherry");
        uniqueFruits.add("Apple"); // This duplicate will be ignored.
        System.out.println("HashSet of unique fruits: " + uniqueFruits);

        // --- Iterating over a HashSet ---
        System.out.println("\nIterating over the set:");
        for (String fruit : uniqueFruits) {
            System.out.println("- " + fruit);
        }

        // --- Removing an Element ---
        uniqueFruits.remove("Banana");
        System.out.println("\nSet after removing 'Banana': " + uniqueFruits);

        // --- Checking if an Element Exists ---
        boolean hasCherry = uniqueFruits.contains("Cherry");
        System.out.println("Does the set contain 'Cherry'? " + hasCherry);
    }
}
